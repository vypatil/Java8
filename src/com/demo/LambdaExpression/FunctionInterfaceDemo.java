package com.demo.LambdaExpression;

interface MathsInterface{
	
	public int add(int a , int b);
}


public class FunctionInterfaceDemo {
	
	public static void main(String[] args) {
		
		MathsInterface obj = (a,b) -> (a+b);
		
		int sum = obj.add(50, 20);
		
		System.out.println(sum);
	}
	

}
