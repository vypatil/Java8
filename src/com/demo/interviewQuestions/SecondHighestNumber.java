package com.demo.interviewQuestions;

import java.util.Arrays;

public class SecondHighestNumber {
	
	public static void main(String[] args) {
		
		
		Integer arr [] = {11,50,30,88,99,97,100};
		
		Integer integer = Arrays.asList(arr).stream().sorted().skip(arr.length-2).findFirst().get();
		System.out.println(integer);
		
	}

}
