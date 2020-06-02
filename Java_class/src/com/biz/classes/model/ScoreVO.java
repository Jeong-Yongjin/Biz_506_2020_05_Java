package com.biz.classes.model;
/*
 * 클래스 작성 목적 1
 * 다양한 type의 변수를 선언하고 한개의 인스턴스를 통해 접근하여 마치 한개의 변수인 것처럼 사용할 수 있다.
 * 
 * VO(Value Object)클래스
 * method에게 보낼 매개변수가 많을 경우 일일이 매개변수를 개별적으로
 * 전달하는 것 보다는 매개변수들을 모은 클래스를 만들고 인스턴스를
 * 생성한 다음 변수를 담아 전달하는 것이 좋다.
 * 
 * 이때 사용하는 클래스들을 Value Object라고 한다.
 * 
 * DTO(Data Transfer Object)클래스라고도 한다.
 * 
 * 주 용도가 변수사용
 */
public class ScoreVO {

	// 모든 필드(맴버, 속성)변수를 private으로 선언
	private String num;
	private String name;
	
	private int IntKor;
	private int IntEng;
	private int IntMath;
	private int IntMusic;
	private int IntArt;
	private int IntSci;
	
	private int IntSum;
	private int IntAvg;
	
	
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getIntKor() {
		return IntKor;
	}
	public void setIntKor(int intKor) {
		IntKor = intKor;
	}
	public int getIntEng() {
		return IntEng;
	}
	public void setIntEng(int intEng) {
		IntEng = intEng;
	}
	public int getIntMath() {
		return IntMath;
	}
	public void setIntMath(int intMath) {
		IntMath = intMath;
	}
	public int getIntSum() {
		return IntSum;
	}
	public void setIntSum(int intSum) {
		IntSum = intSum;
	}
	public int getIntAvg() {
		return IntAvg;
	}
	public void setIntAvg(int intAvg) {
		IntAvg = intAvg;
	}
	public int getIntMusic() {
		return IntMusic;
	}
	public void setIntMusic(int intMusic) {
		IntMusic = intMusic;
	}
	public int getIntArt() {
		return IntArt;
	}
	public void setIntArt(int intArt) {
		IntArt = intArt;
	}
	public int getIntSci() {
		return IntSci;
	}
	public void setIntSci(int intSci) {
		IntSci = intSci;
	}
	
	
	
	
	
	
	
	
	
	
	
}
