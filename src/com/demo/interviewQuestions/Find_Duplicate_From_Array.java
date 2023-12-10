package com.demo.interviewQuestions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Find_Duplicate_From_Array {
	
	public static void main(String[] args) {
		
		
		Integer array [] = {10,20,10,50,40,30,20,10,80};
		
		List<Integer> list = Arrays.asList(array);
		
		Map<Integer, Long> m1 = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(m1);
		
		m1.entrySet().stream().filter(i -> i.getValue() > 1).forEach(System.out::println);
	}

}
