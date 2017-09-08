package com.pravin.collection;

public class CountingTest {

	public static void main(String[] args) {
		String str = " jfksafl slfkjsalkjf lksajfl ksjlfk jaslf as ";
		int length = str.length();
		int i = 0, count = 0;
		char ch[] = new char[str.length()];
		while (i < length) {
			ch[i] = str.charAt(i);
			if (((ch[i] != ' ') && (ch[i - 1] == ' ')) || ((ch[0] != ' ') && (i == 0)))
				count++;
				i++;
		}
		System.out.println("No of Words  :" + count);		
		int occurrences = 0;
		for(char c : str.toCharArray()){
		   if(c!= ' '){
		      occurrences++;
		   }
		}
		System.out.println("No of Charaters :"+occurrences);
	}
}