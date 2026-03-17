package com.jungsuk.ch05.array;

import java.util.Arrays;

public class ArrayEx10 {
	public static void main(String[] args) {
		/*
		 * 예제 5-10
		 * 오름차순, 내림차순 정렬
		 * 
		 * 선택 정렬 : O(n²)
		 * 버블 정렬 : O(n²)
		 */
		int[] arr = new int[10];
		int[] arr2 = new int[10];
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * arr.length);
			arr2[i] = (int)(Math.random() * arr.length);
		}
		
		//오름차순 - 선택 정렬 : 인덱스에 들어갈 가장 작은 값 찾음
		for(int i = 0; i < arr.length; i++) {
			int minIdx = i;
			
			for(int j = i + 1; j < arr.length; j++) {
				if(arr[j] < arr[minIdx]) 
					minIdx = j;
			}
			
			int temp = arr[i];
			arr[i] = arr[minIdx];
			arr[minIdx] = temp;

			System.out.println(Arrays.toString(arr));
		}
		
		System.out.println();

		//내림차순 - 버블 정렬 : 인접한 두 값 비교, 작은 값을 뒤로 보냄
		for(int i = 0; i < arr2.length; i++) {
			for(int j = 0; j < arr2.length - 1 - i; j++) {
				if(arr2[j] < arr2[j + 1]) {
					int temp = arr2[j];
					arr2[j] = arr2[j + 1];
					arr2[j + 1] = temp;
				}
			}

			System.out.println(Arrays.toString(arr2));
		}
	}
}
