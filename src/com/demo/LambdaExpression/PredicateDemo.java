package com.demo.LambdaExpression;

import java.util.function.Predicate;

// ----- its also gives ture of false ----------

public class PredicateDemo {
	
	public static void main(String[] args) {
		
		Predicate<Integer> p = n -> (n<0);
		
		System.out.println("result is " + p.test(-7));
	}

}
