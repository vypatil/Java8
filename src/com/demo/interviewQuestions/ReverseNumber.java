package com.demo.interviewQuestions;

public class ReverseNumber {
	
		public static void main(String[] args) {
			
			Integer num = 2345;
			
			String.valueOf(num).chars().mapToObj(i -> (char) i)
			.sorted((a,b) -> b - a ).forEach(System.out :: print);
			
			
			System.out.println();
			
			int reminder= 0;
			
			int reverse = 0;
			
			while(num != 0) {
				
					reminder = num % 10;
					reverse = reverse * 10 + reminder;
					
					num = num / 10;
			}
			System.out.println(reverse);
			
		}

}
