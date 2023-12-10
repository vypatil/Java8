package com.demo.interviewQuestions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindOccurenceOfGivenString {

	
	public static void main(String[] args) {
		
		String name="vaibhavPatil&TusharPatilBothAreBelongsFromPatilFamily.";
		
		String serchString= "Patil";
		
		findOccurence(name , serchString);
	}
	
	public static void findOccurence(String mainString , String serchString) {
		
		
		Pattern pattern = Pattern.compile(serchString);
		Matcher matcher = pattern.matcher(mainString);
		
		int count=0;
		
		while(matcher.find()) {
			
			count++;
			
		}
		
		System.out.println("Occurence of---" + serchString + " is ---" + count);
				
				
				
	}
}
