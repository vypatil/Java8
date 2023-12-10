package com.demo.interviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateFromArray {
	
	public static void main(String[] args) {
		
		Integer arr [] = {10,50,50,30,60,10,20,10};
		
		List<Integer> collect = Arrays.asList(arr).stream().collect(Collectors.toList());
								
		
		System.out.println(collect);
		
		
		List<Integer> fetchingDuplicate = Arrays.asList(arr).stream()
										  .filter(e -> Collections.frequency(Arrays.asList(arr), e)==1)
										  .collect(Collectors.toList());
		
		System.out.println(fetchingDuplicate);
		
		
		List<Integer> removeDuplicate2 = Arrays.asList(arr).stream().distinct().collect(Collectors.toList());
		System.out.println(removeDuplicate2);
		
		
		
	}

}
