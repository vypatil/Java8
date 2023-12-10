package com.demo.LambdaExpression;

interface functionInterface{
	
	void abstractFun(int a);
	
	default void normalFun() {
		
		System.out.println("Inside normal fun method");
	}
}

public class LambdaExpressionDemo {
	
	public static void main(String[] args) {
		
		functionInterface obj = (int x) -> System.out.println(2 * x);
		
		obj.abstractFun(10);
		
		obj.normalFun();
	}
		
}
