package com.demo.interviewQuestions;

import java.util.stream.IntStream;

public class PalindromString {
	
	public static void main(String[] args) {
			
		String name = "nayan";
		
		boolean res = IntStream.range(0, name.length()/2)
					  .allMatch(i -> name.charAt(i)==name.charAt(name.length()-i-1));
		
		System.out.println(res);
			
		}
}
