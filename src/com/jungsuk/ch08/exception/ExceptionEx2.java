package com.jungsuk.ch08.exception;

public class ExceptionEx2 {
	public static void main(String[] args) {
		int num = 100;
		int result = 0;
		
		for(int i = 0; i < 10; i++) {
			try {
				result = num / (int)(Math.random() * 10);
				System.out.println(result);
			} catch(ArithmeticException e) { //산술연산과정 중 오류 존재 시 발생
				System.out.println("0");
			}
			
		}
	}
}
