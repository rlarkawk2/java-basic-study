package com.jungsuk.ch05.array;

public class ArrayEx8 {
	public static void main(String[] args) {
		/*
		 * 예제 5-8
		 * 로또 번호 생성
		 * 1 ~ 45, 6자리 출력
		 */
		int[] arr = new int[45];
		
		for(int i = 0; i < arr.length; i++)
			arr[i] = i + 1;
		
		for(int i = 0; i < arr.length; i++) {
			int num = (int)(Math.random() * arr.length);
			int temp = arr[i];
			arr[i] = arr[num];
			arr[num] = temp;
		}
		
		for(int i = 0; i < 6; i++)
			System.out.println(arr[i]);
	}
}
