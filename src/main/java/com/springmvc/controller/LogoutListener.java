package com.springmvc.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.session.SessionDestroyedEvent;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
@Component
public class LogoutListener implements	ApplicationListener<SessionDestroyedEvent> {
	private static Logger logger = LoggerFactory.getLogger(SecurityConfig.class);
	@Override
	public void onApplicationEvent(SessionDestroyedEvent event) {
		List<SecurityContext> lstSecurityContext = event.getSecurityContexts();
		UserDetails ud;
		logger.info("LogoutListener is initialized");
		for (SecurityContext securityContext : lstSecurityContext) {
			securityContext.getAuthentication().setAuthenticated(false);
			ud = (UserDetails) securityContext.getAuthentication().getPrincipal();
			System.out.println(ud.isEnabled());
		}
	}
}