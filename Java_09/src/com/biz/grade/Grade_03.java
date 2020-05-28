package com.biz.grade;

import java.util.Random;

public class Grade_03 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		int intnum = rnd.nextInt();

		int num1 = intnum * 55;
		int num2 = num1;
		
		System.out.println(num2);
		
	}
	
}
