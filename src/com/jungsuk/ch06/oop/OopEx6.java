package com.jungsuk.ch06.oop;

/*
 * 예제 6-6
 * 클래스 내 사칙연산 메서드 만들기
 */

public class OopEx6 {
	public static void main(String[] args) {
		
		Calculator calculator = new Calculator();
		
		long x = 10L;
		long y = 3L;
		
		System.out.printf("%d + %d = : %d\n", x, y, calculator.add(x, y) );
		System.out.printf("%d - %d = : %d\n", x, y, calculator.subtract(x, y) );
		System.out.printf("%d * %d = : %d\n", x, y, calculator.multiply(x, y) );
		System.out.printf("%d / %d = : %f\n", x, y, calculator.divide(x, y) );
	}
}

class Calculator{
	long add(long a, long b) {
		return a + b;
	}
	long subtract(long a, long b) {
		return a - b;
	}
	long multiply(long a, long b) {
		return a * b;
	} 
	double divide(double a, double b) {
		return b != 0 ? a / b : 0;
	}
}