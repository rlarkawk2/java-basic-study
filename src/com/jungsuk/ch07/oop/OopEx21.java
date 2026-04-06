package com.jungsuk.ch07.oop;

/*
 * 예제 7-21
 * 다형성
 */

public class OopEx21 {
	public static void main(String[] args) {
		Buyer buyer = new Buyer();
		
		buyer.buy(new Tv());
		buyer.buy(new Computer());
		
		System.out.println("남은돈 : " + buyer.money);
		System.out.println("포인트 : " + buyer.bonusPoint);
	}
}

class Product{
	int price;
	int bonusPoint;
	
	public Product(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv extends Product{
	Tv() {
		super(100);
	}

	
	public String toString(){
		return "Tv";
	}
}

class Computer extends Product{
	Computer() {
		super(200);
	}
	
	public String toString(){
		return "Computer";
	}
}

class Buyer{
	int money = 1000;
	int bonusPoint = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액부족");
			return;
		}
		
		money -= bonusPoint;
		bonusPoint += p.bonusPoint;
		
		System.out.println(p + " 구입");
	}
}