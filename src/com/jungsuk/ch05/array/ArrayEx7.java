package com.jungsuk.ch05.array;

import java.util.Arrays;

public class ArrayEx7 {
	public static void main(String[] args) {
		/*
		 * 예제 5-7
		 * 배열 요소 순서 바꾸기 - 카드 섞기
		 */
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++)
			arr[i] = i + 1;
		
		for(int i = 0; i < arr.length; i++) {
			int idx = (int)(Math.random() * arr.length);
			
			int temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;
		}
		
		System.out.println(Arrays.toString(arr));
	}
}
