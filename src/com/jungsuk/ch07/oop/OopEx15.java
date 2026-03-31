package com.jungsuk.ch07.oop;

/*
 * 예제 7-15
 * 다형성
 */

public class OopEx15 {
	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe; //부모 클래스의 변수, 메서드만 사용 가능
		//car.water();
		fe2 = (FireEngine)car;
		fe2.water();
	}
}

class Car{
	String color;
	int door;
	
	void drive() {
		System.out.println("dirve");
	}
	
	void stop(){
		System.out.println("stop");
	}
}

class FireEngine extends Car{
	void water() {
		System.out.println("water");
	}
}