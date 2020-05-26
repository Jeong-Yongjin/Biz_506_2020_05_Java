package com.biz.grade;

import java.util.Random;

public class Grade_05 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int intKor0 = random.nextInt(50) + 51;
		int intKor1 = random.nextInt(50) + 51;
		int intKor2 = random.nextInt(50) + 51;
		int intKor3 = random.nextInt(50) + 51;
		int intKor4 = random.nextInt(50) + 51;
		int intKor5 = random.nextInt(50) + 51;
		int intKor6 = random.nextInt(50) + 51;
		int intKor7 = random.nextInt(50) + 51;
		int intKor8 = random.nextInt(50) + 51;
		int intKor9 = random.nextInt(50) + 51;
		
		System.out.println("0의 국어 점수 : " + intKor0);
		System.out.println("1의 국어 점수 : " + intKor1);
		System.out.println("2의 국어 점수 : " + intKor2);
		System.out.println("3의 국어 점수 : " + intKor3);
		System.out.println("4의 국어 점수 : " + intKor4);
		System.out.println("5의 국어 점수 : " + intKor5);
		System.out.println("6의 국어 점수 : " + intKor6);
		System.out.println("7의 국어 점수 : " + intKor7);
		System.out.println("8의 국어 점수 : " + intKor8);
		System.out.println("9의 국어 점수 : " + intKor9);
		
		int sum = intKor0 + intKor1 + intKor2 + intKor3 + intKor4 + intKor5 + intKor6 + intKor7 + intKor8 + intKor9;
		int avg = sum/10;
		
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
	}
	
}
