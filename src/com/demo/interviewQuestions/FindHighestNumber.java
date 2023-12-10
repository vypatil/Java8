package com.demo.interviewQuestions;

import java.util.Arrays;
import java.util.stream.Collectors;

public class FindHighestNumber {
	
	public static void main(String[] args) {
		
		Integer arr [] = {10,50,200,900,100,700,6000};
		System.out.println(arr.length);
		
		//1.
		Integer integer = Arrays.asList(arr).stream().sorted().collect(Collectors.toList()).get(arr.length-1);
		System.out.println(integer);
		
		//2.
		Integer integer2 = Arrays.asList(arr).stream().max((e1,e2) -> e1.compareTo(e2)).get();
		System.out.println(integer2);
		
		
		// finding lowest element
		Integer integer3 = Arrays.asList(arr).stream().min((e1,e2) -> e1.compareTo(e2)).get();
		System.out.println(integer3);
		
		
	}

}
