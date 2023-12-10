package com.demo.interviewQuestions;

import java.util.Arrays;

public class RemoveNumberFromArray {
	
	public static void main(String[] args) {
		
		int arr [] = {10,20,30,40,50,60};
		
		int[] array = Arrays.stream(arr).filter(i -> i !=3).toArray();
		System.out.println(Arrays.toString(array));
	}

}
