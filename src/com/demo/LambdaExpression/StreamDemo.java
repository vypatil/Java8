package com.demo.LambdaExpression;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StreamDemo {
	
	public static void main(String[] args) {
		
		
		int[] intArry = {1,2,3,4,5};
		
		IntStream intStream = Arrays.stream(intArry);
		
		intStream.forEach(System.out::println);
	}

}
