package com.jungsuk.ch06.oop;

/*
 * 예제 6-15
 * 재귀호출로 팩토리얼 만들기
 */

public class OopEx15 {
	public static void main(String[] args) {
		int num = 4;
		int result = factorial(num);
		
		System.out.println(num + "의 팩토리얼 값은 " + result);
	}
	
	public static int factorial(int num) {
		return num != 1 ? num * factorial(num - 1) :  1;
	}
}