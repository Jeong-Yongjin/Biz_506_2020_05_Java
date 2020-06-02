package com.biz.service;

/*
 * 클래스 중에서 main() method가 없는 클래스는 혼자서는 아무런 기능도 할 수없다.
 * 
 * main() method가 없는 클래스의 기능을 이용하고 싶으면 main() method가 있는 곳에서
 * 클래스의 인스턴스를 만들어야 한다.
 * 
 * 인스턴스를 통해서 기능을 "호출(메서드 사용)"해야한다.
 * 
 * 인스턴스.메서드() 형식으로 점(.) 연산자를 통해서 호출한다.
 */
public class MethodService {

	/*
	 * method() 선언문
	 * print(int num)라는 method를 선언해 두고 누군가 호출해서 사용하도록 만드는 절차
	 * 
	 * print() 괄호 안에 선언된 변수를 매개변수라고 한다.
	 * 
	 * 매개변수는 print() method를 호출할 때 전달하는 정수 값을 수신(받을)할 곳이다.
	 * 
	 * 만약 인스턴스.print(50)이라고 하면 정수 50이 num 변수에 담겨서 print() method
	 * 내부로 전달된다.
	 * 
	 * print() method 내부의 코드에서는 num 변수에 담긴 값을 사용하여 연산을 수행 할 수 있다.
	 */
	public void print(int num) {
		
		System.out.println(num);
		System.out.println(100);
	}
	
}
