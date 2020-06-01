package com.biz.classes;

import com.biz.classes.model.BankVO;

public class ClassEx_12 {

	public static void main(String[] args) {
		
		BankVO[] banklist = new BankVO[5];
		
		banklist[0] = new BankVO();
		banklist[1] = new BankVO();
		banklist[2] = new BankVO();
		banklist[3] = new BankVO();
		banklist[4] = new BankVO();
		
		banklist[0].setStrnum("001");
		banklist[1].setStrnum("002");
		banklist[2].setStrnum("003");
		banklist[3].setStrnum("004");
		banklist[4].setStrnum("005");
		
		banklist[0].setStrdate("2020-06-01");
		banklist[1].setStrdate("2020-06-01");
		banklist[2].setStrdate("2020-06-01");
		banklist[3].setStrdate("2020-06-01");
		banklist[4].setStrdate("2020-06-01");
		// for(int i = 0 ; i <= banklist.length ; i++) {
		// 	banklist[i].setStrdate("2020-06-01");
		// }
		
		
		banklist[0].setIntinput(5000);
		banklist[2].setIntinput(5000);
		banklist[1].setIntoutput(1000);
		banklist[3].setIntoutput(1000);
		banklist[4].setIntoutput(1000);
		
	}
	
}
