package com.biz.score.service;

import com.biz.socre.vo.ScoreVO;

public class ScoreServiceV2 {

	private ScoreVO[] scores;
	
	/*
	 * 필드변수로 scores 선언되어 있기 때문에 학생 총점과 평균을 계산한 후
	 * 어디에 지정해야 할지를 고민하지 않아도 된다.
	 */
	public void ScoreSum(ScoreVO[] scores) {
		
		this.scores = scores;
		
		for(int i = 0 ; i < scores.length ; i++) {
			int sum = this.scores[i].getIntKor();
			sum += this.scores[i].getIntEng();
			sum += this.scores[i].getIntMath();
			sum += this.scores[i].getIntMusic();
		
			this.scores[i].setIntStSum(sum);
		}	
	}
	
	public void scoreAvg() {
		for(int i = 0 ; i < scores.length ; i++) {
			
			int sum = this.scores[i].getIntStSum();
			this.scores[i].setIntStAvg(sum / 4);
		}
	}
	
	public void scoreList() {
		
		LineService lineService = new LineService();
		String d_line = lineService.do_line(50);
		String s_line = lineService.single(50);
		
		System.out.println(d_line);
		System.out.println("\t\t 성적리스트");
		System.out.println(d_line);
		System.out.println("학번\t 국어\t 영어\t 수학\t 음악\t 총점\t 평균");
		System.out.println(s_line);
	
		int intKorSum = 0;
		int intEngSum = 0;
		int intMathSum = 0;
		int intMusicSum = 0;
		int intSumSum = 0;
		int intAvgSum = 0;
		
		// 점수리스트를 표시할 때는 for 반복문을 이용해서 사용
		// this.는 형재 이 클래스에 선언된 이라는 뜻
		for(int i = 0 ; i < scores.length ; i++) {
			
			intKorSum += scores[i].getIntKor();
			intEngSum += scores[i].getIntEng();
			intMathSum += scores[i].getIntMath();
			intMusicSum += scores[i].getIntMusic();
			intSumSum += scores[i].getIntStSum();
			intAvgSum += scores[i].getIntStAvg();
			System.out.printf("%s\t %d\t%d\t %d\t %d\t %d\t %d\n",scores[i].getStrName(), scores[i].getIntKor(),
					scores[i].getIntEng(), scores[i].getIntMath(),scores[i].getIntMusic(),
					scores[i].getIntStSum(), scores[i].getIntStAvg());
		}
		System.out.println(s_line);
		System.out.printf("%s\t %d\t%d\t %d\t %d\t %d\t %d\n","총점", intKorSum, intEngSum, intMathSum, intMusicSum, intSumSum, intAvgSum);
		System.out.printf("%s\t %d\t%d\t %d\t %d\t %d\t %d\n","평균", intKorSum/scores.length, intEngSum/scores.length,
				intMathSum/scores.length, intMusicSum/scores.length, intSumSum/scores.length, intAvgSum/scores.length);
		System.out.println(d_line);
		
	}				
	
		
	
	}
	
/*
for(int i = 0 ; i < scores.length ; i++) {
int Sum = scores[i].getIntKor();
Sum += scores[i].getIntEng();
Sum += scores[i].getIntMath();
Sum += scores[i].getIntMusic();
int Avg = Sum / 4;

System.out.printf("%s\t %d\t %d\t %d\t %d\t %d\t %d\n", scores[i].getStrName(), scores[i].getIntKor(),
		scores[i].getIntEng(), scores[i].getIntMath(), scores[i].getIntMusic(), scores[i].getIntStSum(), scores[i].getIntStAvg());




}
System.out.println(s_line);
*/
		
