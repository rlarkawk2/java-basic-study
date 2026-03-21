package com.jungsuk.ch05.array;

public class ArrayEx22 {
	public static void main(String[] args) {
		/*
		 * 예제 5-22
		 * 두 행렬을 곱한 결과 출력
		 */
		
		final int SIZE = 3;
		
		int[][] arr1 = new int [SIZE][SIZE];
		int[][] arr2 = new int [SIZE][SIZE];
		int[][] result = new int [SIZE][SIZE];
		
		/* 행렬 초기화 */
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				arr1[i][j] = i * SIZE + j + 1;
				arr2[i][j] = i * SIZE + j + 1;
			}
		}
		
		/* 곱셈 계산 */
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				for(int k = 0; k < SIZE; k++) {
					result[i][j] += arr1[i][k] * arr2[k][j];
				}
			}
		}

		/* 출력 */
		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				System.out.printf("%2d ", arr1[i][j]);
			}

			System.out.println();
		}
		
		System.out.println();

		for(int i = 0; i < SIZE; i++) {
			for(int j = 0; j < SIZE; j++) {
				System.out.printf("%2d ", arr2[i][j]);
			}
			
			System.out.println();
		}

		System.out.println();
		
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr1[i].length; j++) {
				System.out.printf("%2d ", result[i][j]);
			}

			System.out.println();
		}
	}
}
