package com.biz.grade;

public class Array_03 {

	/*
	 * 1 ~ 100까지 범위의 수중 짝수의 개수는 몇 개인가
	 * 1 ~ 100까지 범위의 수중 3의 배수의 개수는 몇 개인가
	 */
	public static void main(String[] args) {
		
		int num2 = 0;
		int num3 = 0;
		for(int num = 1 ; num <=100 ; num++) {
			if(num % 2 == 0) {
				num2++;
			
			}
			
			if(num % 3 == 0) {
				num3++;
		}
		}
		System.out.println("짝수의 개수 : " + num2);
		System.out.println("3의 배수의 개수 : " + num3);
	}
}
