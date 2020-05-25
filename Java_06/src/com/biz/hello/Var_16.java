package com.biz.hello;

import java.util.Random;

public class Var_16 {

	public static void main(String[] args) {
		
		int intKor, intEng, intMath;
		Random rnd = new Random();
		intKor = rnd.nextInt(50) + 51;
		intEng = rnd.nextInt(50) + 51;
		intMath = rnd.nextInt(50) + 51;
		
		int sum = (intKor + intEng + intMath);
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + sum/3);
		
	}
	
}
