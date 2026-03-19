package com.jungsuk.ch05.array;

import java.util.Arrays;

public class ArrayEx11 {
	public static void main(String[] args) {
		/*
		 * 예제 5-11
		 * 배열 내 저장된 수의 빈도 수 구하기
		 */
		
		int[] arr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10);
		}
		
		System.out.println(Arrays.toString(arr));
		
		int[] cntArr = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			cntArr[arr[i]]++; 
		}
		
		for(int i = 0; i < cntArr.length; i++) {
			System.out.println(i + " : " + cntArr[i] + "번");
		}
		
	}
}
