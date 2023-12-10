package com.demo.interviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OccurenceOfCharacters {
	
	public static void main(String[] args) {
		
		String s = "Live In Java ";
		
		String arr[] = s.split("");
		
		Map<String,Long> collect = Arrays.asList(arr).stream()
								   .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(collect);
		
		Long count = Arrays.asList(arr).stream().filter(i -> i.equals("v")).count();
		System.out.println(" 'v'- Occuring Time = " + count);
		
		
	}

}
