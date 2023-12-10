package com.demo.interviewQuestions;

public class Lowest_Number {
	
	public static void main(String[] args) {
		
		
		int[] num = {1,2,4,-7,-1,0,4};
		
		int closestNumber = 1110;
		
		for(int i= 0 ; i<num.length ; i++) {
			
			
			if(Math.abs(num[i])<=Math.abs(closestNumber)){
				
				closestNumber=num[i];
			}
		} 
		
		System.out.println("The closest Number " + closestNumber);
		
		System.out.println(Math.abs(-7));
	}

}
