package com.biz.grade;

import java.util.Random;

import com.biz.score.Student;

public class Grade_05 {

	public static void main(String[] args) {
		
		int sum = 0;
		for(int i = 0 ; i < 1000000000 ; i++) {
			sum = 100;
			
		}
		// sum은 얼마??
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(sum);
		}
		
		System.out.println(sum);
		// for문에서 저장되서 나왔고 for반복문이 끝나고 초기화를 시키지 않아서 for문에서 마지막에 저장된 값이 나옴
		
		Student student = new Student();
		
		// Student 클래스에 선언된 make() 메서드를 호출하기
		student.make();
		String strN = student.getName();
		/*
		 * public class Student {
		 *      String strName = "홍길동";
		 *      public void make() {
		 *         strName = "이몽룡";
		 *      }
		 *      ?? strName => 이몽룡
		 *}
		 *
		 *      public String getName() {
		 *      return strName;
		 *      }
		 *}
		 *?? strName =?
		 */
		
		System.out.println(strN);
		
		
		 Random rnd = new Random();
		 rnd.nextInt();
		 
		
	}
	
}
