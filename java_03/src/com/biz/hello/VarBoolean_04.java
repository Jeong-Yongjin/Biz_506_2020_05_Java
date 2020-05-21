package com.biz.hello;

import java.util.Random;

public class VarBoolean_04 {

	public static void main(String[] args) {
		
		// type이 다른 변수 3개를 선언
		/*
		 *  변수의 초기화
		 *  type 생성 키워드로 선언만된 변수는 사용하는데 제약이 있다.
		 *  선언만 된 변수는 메모리(기억장치)의 어딘가에 지정된 위치인데 알수없는 어떤 값이 저장되어 있을 수도 있다.
		 *  때문에 변수는 어떠한 값을 할당, 저장, 대입하기 전까지는 읽기를 할 수 없다.
		 *  변수는 선언을 한 후 최소한 1번은 값을 저장해주어야만 읽을 수가 있다.
		 *  
		 *  이러한 것을 변수가 사용 가능하다라고 한다.
		 *  사용가능하다 = 저장, 읽기가 모두 가능한 상태
		 *  
		 *  또한, 변수를선언한 후 어떠한 값을 저장하는 것을 변수를 초기화 한다라고 한다.
		 *  변수는 초기화가 되어야만 사용(읽기, 쓰기)가 가능하다.
		 *  
		 *  변수는 기본적으로 제공되는 int, float, long, double, boolean, char 들은 키워드 변수 = 값 형식으로 
		 *  선언과 초기화를 할 수 있다.
		 */
		String str1 = "대한민국";
		
		/*
		 * Random type의 rnd 변수를 선언하는 명령
		 * 기본적으로 제공되지 않는 필요에 따라 JDK를 import해서 선언하는 변수들은 초기화 하는 방법이 조금 다르다.
		 * 
		 * 키워드 변수 = new 키워드()
		 * 이것은 java의 문법구조이므로 형식 그대로 이행하자.
		 */
		Random rnd = new Random();
		
		int num1 = 0;
		
		/*
		 * 기본으로 제공되는 키워드로 작성된 변수는 보통 어떤 값을 저장하는 역할을 수행한다.
		 * 또는 보관하고 있는 어떤 값을 읽어서 다른 변수에 복사하거나, 읽기 용도로 사용을 한다.
		 * 
		 * JDK에서 import한 키워드로 생성(선언, 초기화)한 변수는 하는 일이 조금 다르다.
		 * DOT(.)으로 다른 키워드, 키워드()와 연결을 한 명령문 형태로 작성되어 그들만의 역할을 수행한다.
		 * 
		 * Random으로 생성(선언, 초기화)된 rnd변수는 .nextInt() method를 연결하여 명령문이 완성되고
		 * 임의의 정수를 만들어서 왼쪽의 변수에 저장하는 역할을 수행한다.
		 * 
		 * .nextInt(100) method를 연결하면 이 명령문은 0부터 99까지의 임의의 정수를 만들어 num1변수에 저장한다.
		 */
		num1 = rnd.nextInt(100); // ()안의 숫자 미만까지 표시
		
		System.out.println(num1);
	}
}