package com.jungsuk.ch06.oop;

/*
 * 예제 6-18
 * x^1 ~ x^n 합 구하기
 */

public class OopEx18 {

	public static void main(String[] args) {
		int x = 2;
		int num = 5;
		long result = 0;
		
		for(int i = 1; i <= num; i ++) {
			result +=  power(x, i);
		}
		
		System.out.println(result);
	}
	
	public static int power(int x, int num) {
		return num != 1 ? x * power(x, num - 1) : x;
	}
}
