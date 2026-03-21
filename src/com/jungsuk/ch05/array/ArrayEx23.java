package com.jungsuk.ch05.array;

import java.util.Scanner;

public class ArrayEx23 {
	public static void main(String[] args) {
		/*
		 * 예제 5-23
		 * 영어단어를 보여주고 뜻을 맞춤
		 */
		
		/* 배열 초기화 */
		String[][] engWord = new String[][] {
			{"apple","banana","wartermelon"},
			{"pear","strawberry","peach"},
			{"plum","grapes","dragon fruit"}
		};
		
		String[][] korWord = new String[][] {
			{"사과","바나나","수박"},
			{"배","딸기","복숭아"},
			{"자두","포도","용과"}
		};
		
		int x = 0;
		int y = 0;
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			boolean exit = false;

			x = (int)(Math.random() * engWord.length);
			y = (int)(Math.random() * engWord.length);
			
			while(true) {
				System.out.print(engWord[x][y] + " - 단어의 뜻은?(종료는 0) >> ");
				String inputStr = sc.nextLine();
				
				if(inputStr.equals("0")) {
					exit = true;
					break;
				}
				
				if(inputStr.equals(korWord[x][y])) {
					System.out.println("정답입니다");
					break;
				}
				else {
					System.out.println("정답이 아닙니다.");
				}
			}
			
			if(exit) break;
		}
		
		sc.close();
		
		System.out.println("종료되었습니다.");
	}
}
