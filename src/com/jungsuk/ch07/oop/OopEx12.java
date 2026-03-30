package com.jungsuk.ch07.oop;

/*
 * 예제 7-12
 * final
 */

class Card{
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	Card(String kind, int num){ //매개변수가 있는 생성자
		KIND = kind; //상수 값 변경 가능
		NUMBER = num;
	}
	
	Card(){
		this("HEART" , 1);
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
}

public class OopEx12 {
	public static void main(String[] args) {
		Card c = new Card("HEART2", 10);
		//c.NUMBER = 5;
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);
	}
}
