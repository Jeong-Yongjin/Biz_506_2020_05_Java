package com.biz.hello;

import java.util.Random;

public class Var_01 {
	
	public static void main(String[] args) {
		
		Random rnd = new Random();
		int num1 = rnd.nextInt(100) + 1;
		
		if(num1 % 3 == 0) {
			System.out.println(" 3의 배수" + num1);
		}
		
		if(num1 % 5 == 0) {
			System.out.println(" 5의 배수 " + num1);
		}
		
	}

}
