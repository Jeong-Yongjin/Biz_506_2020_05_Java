package com.biz.hello;

public class VarBoolean_02 {

	public static void main(String[] args) {
		
		int num1 = 20;
		int num2 = 15;
		
		boolean bVar1 = ( num1 + num2 ) % 2 == 0;
		boolean bVar2 = ( num1 - num2 ) % 2 == 0;
		boolean bVar3 = ( num1 * num2 ) % 2 == 0;
		boolean bVar4 = ( num1 / num2 ) % 2 == 0;
		
		if(bVar1 == true) {
			System.out.println(num1 + num2 + "짝수 입니다.");
		
		}
		if(bVar1 == false) {
			System.out.println(num1 + num2 + "짝수가 아닙니다.");
		}
		
		if(bVar2 == true) {
			System.out.println(num1 - num2 + "짝수 입니다.");
		
		}
		if(bVar2 == false) {
			System.out.println(num1 - num2 + "짝수가 아닙니다.");
		}
		
		if(bVar3 == true) {
			System.out.println(num1 * num2 + "짝수 입니다.");
		
		}
		if(bVar3 == false) {
			System.out.println(num1 * num2 + "짝수가 아닙니다.");
		}
		
		if(bVar4 == true) {
			System.out.println(num1 / num2 + "짝수 입니다.");
		
		}
		if(bVar4 == false) {
			System.out.println(num1 / num2 + "짝수가 아닙니다.");
		}
		
		
		
	}
}
