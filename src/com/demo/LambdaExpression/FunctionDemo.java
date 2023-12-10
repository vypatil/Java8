package com.demo.LambdaExpression;

import java.util.function.Function;

// ----------- its accept one parameter and return specified parameter ---------

public class FunctionDemo {

	public static void main(String[] args) {

		Function<String, Integer> f = s -> s.length();

		System.out.println("lenght is :" + f.apply("ShriRam"));

	//-------------------------------------------------------------
		String name = "vaibhav";

		Function<String, Character> f1 = s -> s.charAt(4);
		
		System.out.println(f1.apply(name));
	}

}
