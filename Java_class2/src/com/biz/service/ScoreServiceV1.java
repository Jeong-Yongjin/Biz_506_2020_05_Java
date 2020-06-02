package com.biz.service;

import com.biz.model.ScoreVO;

public class ScoreServiceV1 {

		public void scorelist(ScoreVO[] scorelist) {
			
		// int lineLenght = 50;
		LineService lineService = new LineService();
		String d_line = lineService.do_line(50);
		String s_line = lineService.single(50);
		
		System.out.println(d_line);
		System.out.println("\t\t 학생 성적표");
		System.out.println(s_line);
		System.out.println("이름\t 국어\t 영어\t 수학\t 총점\t 평균");
		System.out.println(s_line);
		
		
		for(int i = 0; i < scorelist.length ; i++) {
			
			// for() {   } 내에서 선언된 sum, avg변수는
			// for() {   } 명령문이 종료되면 이후에 참조할 수 없다.
			int sum = scorelist[i].getKor();
			sum += scorelist[i].getEng();
			sum += scorelist[i].getMath();
			int avg = sum / 3;
			
			System.out.printf("%s\t %d\t %d\t %d\t %d\t %d\n", scorelist[i].getName(), scorelist[i].getKor(), scorelist[i].getEng(), 
					scorelist[i].getMath(),sum, avg); 
					
			
		}
		
		System.out.println(d_line);
		
		}
	
}
