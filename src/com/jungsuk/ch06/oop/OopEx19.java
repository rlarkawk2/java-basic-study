package com.jungsuk.ch06.oop;

/*
 * 예제 6-19
 * 클래스 변수, 인스턴스 변수
 */

public class OopEx19 {
	public static void main(String[] args) {
		
		/* 클래스 메서드 호출 */
		System.out.println(Calculate.add(20, 10) );
		System.out.println(Calculate.subtract(20, 10) );
		System.out.println(Calculate.multiply(20, 10) );
		System.out.println(Calculate.divide(20, 10) );
		
		/* 인스턴스 메서드 호출 */
		Calculate calculate = new Calculate();
		
		calculate.a = 30;
		calculate.b = 10;
		
		System.out.println(calculate.add() );
		System.out.println(calculate.subtract() );
		System.out.println(calculate.multiply() );
		System.out.println(calculate.divide() );
	}
}

class Calculate{
	
	long a, b; //인스턴스 변수

	/* 인스턴스 메서드 */
	long add() {
		return a + b;
	}
	
	long subtract() {
		return a - b;
	}
	
	long multiply() {
		return a * b;
	}
	
	double divide() {
		return (double)a / b;
	}
	
	/* 클래스 메서드 */
	static long add(long a, long b) { //지역변수
		return a + b;
	}
	
	static long subtract(long a, long b) {
		return a - b;
	}
	
	static long multiply(long a, long b) {
		return a * b;
	}
	
	static double divide(long a, long b) {
		return (double)a / b;
	}
}
