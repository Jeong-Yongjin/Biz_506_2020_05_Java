package com.biz.grade;

import java.util.Random;

public class Grade_13 {
	
	public static void main(String[] args) {
		
		int[] intnum = new int[100];
		Random rnd = new Random();
		
		for(int i = 0 ; i < 100 ; i++) {
			intnum[i] = rnd.nextInt(100) + 1;
		}
		
		int intsum = 0;
		
		for(int i = 0 ; i < 100 ; i++) {
			if(intnum[i] % 3 == 0 || intnum[i] % 5 == 0) {
				System.out.println(intnum[i] + "는 3또는 5의 배수 입니다.");
				intsum += intnum[i];
			}
		}
		System.out.println("===============================================");
		System.out.println("3 또는 5의 배수의 합 : " + intsum);
	}

}
