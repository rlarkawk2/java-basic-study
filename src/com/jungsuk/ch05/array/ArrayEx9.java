package com.jungsuk.ch05.array;

import java.util.Arrays;

public class ArrayEx9 {
	public static void main(String[] args) {
		/*
		 * 예제 5-9
		 * 불연속적인 값들로 배열 채우기
		 */
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			int num = (int)(Math.random() * arr.length);
			arr[i] = num;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
