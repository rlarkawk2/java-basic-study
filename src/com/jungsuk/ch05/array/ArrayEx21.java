package com.jungsuk.ch05.array;

import java.util.Scanner;

public class ArrayEx21 {
	public static void main(String[] args) {
		/*
		 * 예제 5-21
		 * 빙고판 만들고 사용자에게 입력받아 지우기
		 */
		
		/* 숫자 채우기 */
		int[][] arr = new int[5][5];

		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = i * arr.length + j + 1;
			}
		}

		/* 셔플 */
		int x = 0;
		int y = 0;
		int temp = 0;
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				x = (int)(Math.random() * arr.length);
				y = (int)(Math.random() * arr.length);
				
				temp = arr[i][j];
				arr[i][j] = arr[x][y];
				arr[x][y] = temp;
			}
		}
		
		/* 숫자 입력받기 */
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("1~9 사이 숫자를 입력하세요(0 입력 시 종료) >> ");
			int num = Integer.parseInt(sc.nextLine());
			
			if(num == 0)
				break;
			
			for(int i = 0; i < arr.length; i++) {
				for(int j = 0; j < arr[i].length; j++) {
					if(num == arr[i][j]) {
						arr[i][j] = 0;
						break;
					}
					
				}
			}
			
		}
		
		sc.close();
		
		/* 출력 */
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.printf("%2d ", arr[i][j]);
			}

			System.out.println();
		}
	}
}