package com.biz.grade;

import java.util.Random;

/*
 * 학생 20명 5과목의 성적처리
 */
public class Grade_01 {

	public static void main(String[] agrs) {
		
		int stdCount = 20;
		
		// stdCount 만큼의 배열을 생성
				// 과목수 만큼 생성
		int[] intKor = new int[stdCount];
		int[] intEng = new int[stdCount];
		int[] intMath = new int[stdCount];
		int[] intMusic = new int[stdCount];
		int[] intArt = new int[stdCount];
		
		// 임의의 점수를 만들기 위한 도구 생성
		Random random = new Random();

		// 학생들의 점수를 임의로 생성하여 배열에 저장
		for(int i = 0 ; i < 20 ; i++) {
			intKor[i] = random.nextInt(50) + 51;
			intEng[i] = random.nextInt(50) + 51;
			intMath[i] = random.nextInt(50) + 51;
			intMusic[i] = random.nextInt(50) + 51;
			intArt[i] = random.nextInt(50) + 51;
		}
		
		// 학생별 총점, 평균 계산
		
		// 학생별 총점, 평균을 계산하여 저장할 배열 추가 생성
		//int[] stdSum = new int[stdCount];
		//int[] stdAvg = new int[stdCount];
		
// 각 학생의 총점, 평균을 계산하여 stsSum, intSum 저장
		
		
		int[] intStsum = new int[20];

		for(int i = 0 ; i < 20 ; i++) {

			intStsum[i] += intKor[i];
			intStsum[i] += intEng[i];
			intStsum[i] += intMath[i];
			intStsum[i] += intMusic[i];
			intStsum[i] += intArt[i];
		}
		
		// 과목별 총점, 평균 계산
		int intKorsum = 0;
		int intEngsum = 0;
		int intMathsum = 0;
		int intMusicsum = 0;
		int intArtsum = 0;
		
		// 20명 학생의 과목별 총점을 계산
		for(int i = 0 ; i < 20 ; i++) {
			intKorsum += intKor[i];
			intEngsum += intEng[i];
			intMathsum += intMath[i];
			intMusicsum += intMusic[i];
			intArtsum += intArt[i];
			
		}
		
		
		System.out.println("\t\t\t학\t 생\t 성\t 적\t 열\t 람\t 표\t");
		System.out.println("============================================================================");
		System.out.println("\t\t학번\t 국어\t 영어\t 수학\t 음악\t 미술\t 총점\t 평균");
		System.out.println("----------------------------------------------------------------------------");
		
		for(int i = 0 ; i < 20 ; i++) {
		System.out.printf("\t\t%d\t %d\t %d\t %d\t %d\t %d\t %d\t %d\n",
				(i +1), intKor[i], intEng[i], intMath[i], intMusic[i], intArt[i], intStsum[i], intStsum[i]/5 );
		}
		
		System.out.println("----------------------------------------------------------------------------");
		/* printf에서 format기호
		 * %d : (Decimal) 정수, 십진수 등을 표현하는 기호
		 * %s : (String) 문자열을 표현하는 기호
		 * %c : (Character) 문자를 표현하는 기호
		 * \t : tab(8칸)만큼 빈칸을 만들어라
		 * /n : Enter를 누른 것 처럼 줄바꿈을 하여라
		 */
		System.out.printf("\t%s \t %d\t %d\t %d\t %d\t %d\n", "과목 총점", intKorsum, intEngsum, intMathsum, intMusicsum, intArtsum);
		System.out.printf("\t%s \t %d\t %d\t %d\t %d\t %d\n", "과목 평균", intKorsum/20, intEngsum/20, intMathsum/20, intMusicsum/20, intArtsum/20);
		System.out.println("============================================================================");
	}
	
}
