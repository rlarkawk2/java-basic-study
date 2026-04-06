package com.jungsuk.ch07.oop;

import java.util.Vector;

/*
 * 예제 7-22, 7-23
 * 조상타입 참조변수 배열로 공통조상을 가진 객체 저장
 */

public class OopEx22 {
	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		
		Tv2 tv = new Tv2();
		Computer2 c = new Computer2();
		Audio a = new Audio();
		
		b.buy(tv);
		b.buy(c);
		b.buy(a);
		
		b.summary();
		
		b.refund(c);
		
		b.summary();
	}
}

class Product2{
	int price;
	int bonusPoint;
	
	Product2(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
	
	public Product2() {
		
	}
}

class Tv2 extends Product2{
	Tv2() {
		super(100);
	}

	
	public String toString(){
		return "Tv";
	}
}

class Computer2 extends Product2{
	Computer2() {
		super(200);
	}
	
	public String toString(){
		return "Computer";
	}
}

class Audio extends Product2{
	Audio(){
		super(50);
	}
	
	public String toString(){
		return "Audio";
	}
}

class Buyer2{
	int money = 1000;
	int bonusPoint = 0;
	Vector item = new Vector(); //Object 타입 배열, 동적으로 크기가 관리됨
	
	void buy(Product2 p) {
		if(money < p.price) {
			System.out.println("잔액부족");
			return;
		}

		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p); //객체 추가
		
		System.out.println(p + " 구입");
	}
	
	void refund(Product2 p) {
		if(item.remove(p)) { //객체 제거
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "환불");
		}
		else {
			System.out.println("없음");
		}
	}
	
	void summary() {
		int sum = 0;
		String itemList = "";
		
		if(item.isEmpty()) {
			System.out.println("구압한 제품 없음");
			return;
		}
		
		for(int i = 0; i < item.size(); i++) {
			Product2 p = (Product2)item.get(i); //객체 반환
			sum += p.price;
			itemList += i == 0 ? "" + p : ", " + p;
		}
		
		System.out.println("금액 : " + sum);
		System.out.println("물건 : " + itemList);
	}
}