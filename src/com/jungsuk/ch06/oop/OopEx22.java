package com.jungsuk.ch06.oop;

/*
 * 예제 6-22
 * 가변인자
 */

public class OopEx22 {
	public static void main(String[] args) {
		String[] strArr = {"1" , "2" , "3"};
		
		System.out.println(concatnenate("","1","2","3"));
		System.out.println(concatnenate("-",strArr));
		System.out.println(concatnenate(",",new String[]{"3","4","5"}));
		System.out.println(concatnenate(",",new String[0]));
		System.out.println(concatnenate(","));
	}
	
	/* 매개변수로 가변인자를 받음 */
	static String concatnenate(String delim, String... args) {
		String result = "";
		
		for(String str : args) {
			result += str + delim;
		}
		
		return result;
	}
}