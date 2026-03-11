package com.jungsuk.ch05.array;

import java.util.Scanner;

public class ArrayEx5 {
	public static void main(String[] args) {
		/*
		 * 예제5-5. 총합과 평균
		 * 배열의 모든 요소의 총합과 평균을 구함
		 */

		int sum = 0;
		int[] arr = new int[] {1,2,3,4,5};

		for(int i:arr)
		{
			sum += i;
		}

		System.out.printf("총합 : %d\n", sum);
		System.out.printf("평균 : %f", (float)sum/arr.length);
	}
}