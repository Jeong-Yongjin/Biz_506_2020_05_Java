package com.biz.hello;

import java.util.Random;

public class Var_03 {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		int num = rnd.nextInt(900) + 101;
		
		int i = (num - (num % 10));
		
		System.out.println(i);
	
		int num1 = (rnd.nextInt(10)+1) * 100;
		
		System.out.println("VAT 포함가격 : " + num1);
		System.out.println("VAT 별도 가격 : " + (int)(num1/1.1));
		System.out.println("VAT : " + (num1 - (int)(num1/1.1)));
		
		
	}
}
