package com.demo.LambdaExpression;

interface MathsInterface2{
	
	public int add(int a , int b);
}


public class FunctionInterfaceDemo2 {
	
	public static void main(String[] args) {
		
		MathsInterface obj = (a,b) -> {
			
			int sum;
			sum = a+b;
			System.out.println("Addition is -->" + sum);
			return sum;
		};
		
		int total = obj.add(60, 20);
		
		
	}
	

}
