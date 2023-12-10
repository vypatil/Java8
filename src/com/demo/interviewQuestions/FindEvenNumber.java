package com.demo.interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindEvenNumber {
	
	public static void main(String[] args) {
		
		Integer arr [] = {2,4,8,7,3,5,9,15,18};
		
		List<Integer> l1 = Arrays.asList(arr).stream().filter(i -> i%2==0).collect(Collectors.toList());
		System.out.println("Even Numbers " +l1);
		
		List<Integer> l2 = Arrays.asList(arr).stream().filter(k -> k%2 !=0).collect(Collectors.toList());
		System.out.println("odd numbers " + l2);
	}

}
