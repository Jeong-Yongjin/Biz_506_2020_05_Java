package com.biz.hello;

public class VarString_04 {

	public static void main(String[] args) {
		
		// 문자, character형
		char char1 = 'A';
		System.out.println(char1);
		
		int num1 = 0; // 정수형 변수를 선언하고 clear 한다.
		float num2 = 0.0f;// 실수형 변수를 선언하고 clear 한다.
		
		num1 = 10;
		num2 = 10.0f;
		
		System.out.println(num1);
		System.out.println(num2);
		
		// 정수형변수 num1에 보관된 값과 실수형변수 num2에 보관된 값을 덧셈하여 Console에 보여라.
		System.out.println(num1 + num2);
		/*
		 * 정수형변수 num1에 담긴 값과 실수형변수 num2에 담긴 값을 사칙연산을 수행하면 먼저 num1에 담긴 정수값을 실수형태로 변경을 하고
		 * 실수와 실수를 사칙연산을 수행한다.
		 */
		
		
		// 실수형변수에 정수 30과 40을 덧셈하여 보관하라
		num2 = 30 + 40;
		
		// 정수형변수에 실수 30.0과 40.0을 덧셈하여 보관하라
		num1 = (int)(30.0 + 40.0);
		/*
		 * 실수값을 정수형변수에 보관(할당)하라는 명을 내리면 자바 컴파일러는 개발자가 분명 잘못 작성한 코드일 것이다라고 판단을 한다.
		 * 그 이유는 실수값을 정수형변수에 보관을 하게되면 무조건 소수점이하 값을 잘라버린다.
		 * 따라서, 오차가 발생을 하거나 결과에 문제가 생길 것이다라고 판단을 한다.
		 * 때문에 정수 = 실수라는 명령을 만나면 오류를 보인다.
		 * 
		 * 실수 = 정수 명령은 정수값은 소수점 이하가 원래 없기 땜분에 실수형 변수에 담을 때 결과가 문제가 생길 이유가 없다.
		 * 그래서, 그냥 정수형을 실수형으로 변환하여(x.0) 명령을 수행한다.
		 */
		
		// 숫자(정수, 실수)를 문자열형 변수에 저장하라 -- 오류
		// 숫자 + 문자열, 문자열 + 숫자 연산을 수행한 후 저장을 하면 정상적으로 명령이 수행된다.
		// 숫자 30을 문자열형으로 변환하고 문자열 A와 연결한 후 str1에 저장한다.
		// 이때 컴파일러에 의해 숫자 30이 문자열형 "30"으로 변환되는 것을 형 변환(Type Convert, Type Cast)라고 한다.
		//String str1 = 30;
		String str1 = 30 + "A";
		
		// 정수 30을 실수형변수 num3에 저장하라
		// 정수 30을 실수 30.0으로 변환한 후 실수형 변수 num3에 저장한다.
		// 컴파일러에 의해서 정수 30이 실수 30.0으로 변환되는 것이다.
		// type Convert, type cast
		float num3 = 30;
		
		// 실수 30.0을 정수형변수 num4에 저장하라
		// 이때 컴파일러는 절대 30.0을 정수 30으로 변환하지 않는다.
		// 오류를 발생한다.(type mismatch cannot convert)
		int num4 = (int)30.0f;
		/*
		 * 실수값을 정수형변수에 저장하라는 명령을 만나면 컴파일러는 절대 책일 질수 없는 상황이 되어 거부를 한다.
		 * 하지만, 개발자가 이 경우는 반드시 정수형으로 변환된 값이 필요로 하여 만든(작성)코드이니 개발자가 모두 책임을 지겠다라는 의미로
		 * 원래 값에 변환하고자 하는 type을 붙여준다.
		 * 
		 * 이러한 코드를 강제(명시적) 형변환이라고 한다.
		 * 
		 * 이와 달리 컴파일러가 오류없이 형변환을 하는 것을 자동(묵시적) 형변환이라고 한다.
		 * 
		 * 변수1 = 변수2 이런 명령을 만났을 때 오류가 발생할수 있는데 대표적인 오류가 형변환 문제이다.
		 */
		
	}
}
