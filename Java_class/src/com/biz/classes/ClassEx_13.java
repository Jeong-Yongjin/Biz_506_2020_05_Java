package com.biz.classes;

import com.biz.classes.model.BankVO;
import com.biz.classes.service.BankService;
import com.biz.classes.service.BankServiceV2;

public class ClassEx_13 {
 
	public static void main(String[] args) {
		
		BankVO[] banklist = new BankVO[5];
		
		banklist[0] = new BankVO();
		banklist[1] = new BankVO();
		banklist[2] = new BankVO();
		banklist[3] = new BankVO();
		banklist[4] = new BankVO();
		
		for(int i = 0 ; i <= banklist.length ; i++) {
			banklist[i].setStrnum("001");
		}
		
		banklist[0].setStrdate("2020-05-01");
		banklist[1].setStrdate("2020-05-02");
		banklist[2].setStrdate("2020-05-03");
		banklist[3].setStrdate("2020-05-04");
		banklist[4].setStrdate("2020-05-05");
		
		banklist[0].setIntinput(5000);
		banklist[2].setIntinput(5000);
		banklist[1].setIntinput(1000);
		banklist[3].setIntinput(1000);
		banklist[4].setIntinput(1000);
		
		
		// 기본형 변수들
		// primitive variable
		int num = 0; // integer형 변수 num를 선언하고 0으로 clear
		long num1 = 0L; // long형 변수 num1을 선언하고 0으로 clear
		float num2 = 0.0f;
		double num3 = 0.0;
		boolean bYes = false;
		char char1 = 'c'; //charactor형 변수 num를 선언하고 문자 c를 저장
		
		// String(문자열)형 변수는 변수처럼 사용하지만 실제로는
		// 일반변수와 달리 String 클래스로 만든 String형 인스턴스라고 해야한다.
		String strName = "홍길동";
		// String strNavme = new String("홍길동");
		String strNation = new String();
		
		// BankServiceV2 클래스를 사용해서 bankService라는 변수를 선언
		// bankService 변수를 "객체(object)", "인스턴스(Instance)"라고 한다.
		BankServiceV2 bankService = new BankServiceV2();
		// bankService인스턴스를 통해서 bankService() method를 호출하면
		// BankServiceV2 클래스내에 정의된 bankList() method 내의 코드들이 순서대로 실핸된다.
		
		bankService.bankList(banklist);
	}
	
}
