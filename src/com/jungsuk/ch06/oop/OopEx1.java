package com.jungsuk.ch06.oop;


/*
 * 예제 6-1
 * Tv 클래스를 작성하고 Tv 클래스의 인스턴스를 생성
 */

/* Tv 클래스 */
class Tv{
	String color;
	boolean power;
	int channel;
	
	void power() {
		power = !power;
	}
	
	void channelUp() {
		channel++;
	}
	
	void channelDown() {
		channel--;
	}
}

public class OopEx1 {
	public static void main(String[] args) {
		Tv tv = new Tv(); //tv -> Tv 클래스의 인스턴스
		tv.channel = 10;  //멤버변수 변경
		tv.channelDown(); //메서드를 통해 멤버변수 값 변경
		System.out.println("지금 tv 채널 : " + tv.channel); //멤버변수 호출
	}
}
