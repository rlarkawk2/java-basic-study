package com.jungsuk.ch05.array;

public class ArrayEx6 {
	public static void main(String[] args) {
		/*
		 * 예제 5-6
		 * 배열의 요소 중 가장 큰 값과 가장 작은 값 찾기
		 */
		
		int[] arr = new int[] {1,2,3,4,5};
		int minNum = arr[0];
		int maxNum = arr[0];
		
		for(int i = 1; i < arr.length; i++) {
			if(i > maxNum) maxNum = i;
			if(i < minNum) minNum = i;
		}
		
		System.out.println("가장 큰 값 : " + maxNum);
		System.out.println("가장 작은 값 : " + minNum);
	}
}
