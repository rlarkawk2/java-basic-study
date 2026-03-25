package com.jungsuk.ch06.oop;

/*
 * 예제 6-28
 * 초기화 블럭
 */

public class OopEx28 {
	static int[] arr = new int[10];
	
	static {
		for(int i = 0; i < arr.length; i++)
			arr[i] = (int)(Math.random() * 10) + 1;
	}
	
	public static void main(String[] args) {
		for(int i = 0; i < arr.length; i++)
			System.out.println(arr[i]);
	}
}
