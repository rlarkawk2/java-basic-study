package com.jungsuk.ch06.oop;

/*
 * 예제 6-5
 * 카드 클래스 작성, 카드 클래스의 인스턴스 생성
 * 클래스 변수, 인스턴스 변수 구분
 */

public class OopEx5 {
	public static void main(String[] args) {
		
		//클래스 변수 호출 : 카드 인스턴스를 생성하지 않고도 사용 가능
		System.out.println("카드 너비 : " + Card.width);
		System.out.println("카드 높이 : " + Card.height);
		
		//인스턴스 변수 값 변경 : 카드 인스턴스를 생성하고 참조변수로 접근 가능
		Card card = new Card();
		card.kind = "하트";
		card.num = 5;
		
		System.out.println("카드 모양 : " + card.kind);
		System.out.println("카드 숫자 : " + card.num);
		
		// 클래스 변수 값 변경
		Card.width = 50;
		Card.height = 100;

		System.out.println("카드 너비 : " + Card.width);
		System.out.println("카드 높이 : " + Card.height);
	}
	
}

class Card{
	//인스턴스 변수
	String kind;
	int num;
	
	//클래스 변수
	static int width = 100;
	static int height = 200;
}
