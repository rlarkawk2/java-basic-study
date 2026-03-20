package com.jungsuk.ch05.array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx20{
	public static void main(String[] args) {
		/*
		 * 예제 5-20
		 * 미리 0과 1이 입력되어있는 10*10의 좌표
		 * 10*10 내 좌표를 사용자에게 입력받음
		 * 해당 위치의 값이 0이면 X 1이면 O
		 */
		
		int[][] arr = new int[10][10];
		char[][] inputArr = new char[10][10];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int)(Math.random() * 2);
			}
		}
		
		while(true) {
			System.out.print("좌표를 입력하세요(종료는 0) >> ");
			Scanner sc = new Scanner(System.in);
			String numStr = sc.nextLine();
			char[] numChar = numStr.toCharArray();
			
			if(numStr.equals("0")){
				System.out.println("종료되었습니다.");
				break;
			}
			else if(numStr.length() > 2 || numStr.length() <= 1){
				System.out.println("두 자리 숫자만 입력하세요." );
				continue;
			}
			else if((int)numChar[0] < 48 || (int)numChar[0] > 57 || (int)numChar[1] < 48 || (int)numChar[1] > 57) {
				System.out.println("숫자만 입력하세요." );
				continue;
			}

			inputArr[numChar[0] - '0'][numChar[1] - '0'] = arr[numChar[0] - '0'][numChar[1] - '0'] == 1 ? 'O' : 'X';
			
			for(int i = 0; i < inputArr.length; i++) {
				System.out.println(Arrays.toString(inputArr[i]));
			}
			
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
	}
}
