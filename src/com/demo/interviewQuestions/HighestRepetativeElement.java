package com.demo.interviewQuestions;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Optional;

public class HighestRepetativeElement {
	
	public static void main(String[] args) {
		
		
		Integer arr [] = {1,2,1,1,5,3,2,3,2,2,1,6,6};
		
		Optional<Integer> max = Arrays.asList(arr).stream()
								.max(Comparator.comparingInt(i -> Collections.frequency(Arrays.asList(arr),i)));
		
		System.out.println(max);
	}

}
