package com.springmvc.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.session.SessionRegistry;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.session.HttpSessionEventPublisher;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import org.springframework.security.web.util.matcher.RequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter 
{
	private static Logger logger = LoggerFactory
			.getLogger(SecurityConfig.class);

	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth)
			throws Exception {
		logger.info("Security configureGlobal executed");
		auth.inMemoryAuthentication().withUser("admin").password("password")
				.roles("ADMIN");
	}
	

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		logger.info("Security configure executed");
		http.httpBasic().and().authorizeRequests().antMatchers("/")
				.hasRole("ADMIN").anyRequest().authenticated();
		 http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.IF_REQUIRED);		 
		 http.sessionManagement().maximumSessions(4).expiredUrl("/expiredSession").maxSessionsPreventsLogin(true).sessionRegistry(sessionRegistry());		 
		 http.sessionManagement().invalidSessionUrl("/invalidSession");
		 http.logout().logoutRequestMatcher(new AntPathRequestMatcher("/out"));
		 /*http.csrf().disable()
	      .authorizeRequests()
	         .antMatchers("/login", "/logout").permitAll()
	         .antMatchers("/resources/**").permitAll()
	         .antMatchers("/WEB-INF/views/**").permitAll()
	         .antMatchers("/Project/**").hasAnyAuthority("COLLABORATOR","CHEF","SUPERCHEF")
	         .antMatchers("/User/**").hasAnyAuthority("COLLABORATOR","CHEF","SUPERCHEF")
	         .antMatchers("/Reunion/**").hasAnyAuthority("COLLABORATOR","CHEF","SUPERCHEF")
	         .antMatchers("/Task/**").hasAnyAuthority("COLLABORATOR","CHEF","SUPERCHEF")
	         .anyRequest().authenticated()	        
	         .and().logout().logoutSuccessUrl("/logout").permitAll()
	         .and().sessionManagement().maximumSessions(1).sessionRegistry(sessionRegistry());*/

		 //http.sessionManagement().sessionFixation().migrateSession();			 
		 // Configure all requests to use header basic auth. 
	     // CSRF is disabled meaning that session is not saved and all request will need auth
		 // http.authorizeRequests().anyRequest().fullyAuthenticated().and().httpBasic().and().csrf().disable();		 
	}	
    
	 @Bean
	public SessionRegistry sessionRegistry() {
		SessionRegistry sessionRegistry = new SessionRegistryImpl();
		logger.info("Session Registery Executed");
		return sessionRegistry;
	}
	 
	@Bean
	public HttpSessionEventPublisher httpSessionEventPublisher() {
	    return new HttpSessionEventPublisher();
	}
}
