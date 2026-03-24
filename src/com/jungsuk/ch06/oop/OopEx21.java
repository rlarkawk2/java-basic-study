package com.jungsuk.ch06.oop;

/*
 * 예제 6-32
 * 오버로딩
 */

public class OopEx21 {
	public static void main(String[] args) {
		Calculate2 calculate2 = new Calculate2();
		
		/*
		 * calculate2.add(3,3) 먼저 수행 후 콘솔에 출력됨
		 */
		System.out.println("calculate2.add(3, 3) 결과 : " + calculate2.add(3,3));
		System.out.println("calculate2.add(3L, 3) 결과 : " + calculate2.add(3L,3));
		System.out.println("calculate2.add(3, 3L) 결과 : " + calculate2.add(3,3L));
		System.out.println("calculate2.add(3L, 3L) 결과 : " + calculate2.add(3L,3L));
		
		int[] a = {10,20,30};
		System.out.println("calculate2.add(a) 결과 : " + calculate2.add(a));
	}
}

class Calculate2{
	
	int add(int a, int b) {
		System.out.print("int add(int a, int b) - ");
		return a + b;
	}
	
	long add(int a, long b) {
		System.out.print("int add(int a, long b) - ");
		return a + b;
	}
	
	long add(long a, int b) {
		System.out.print("int add(long a, int b) - ");
		return a + b;
	}
	
	long add(long a, long b) {
		System.out.print("int add(long a, long b) - ");
		return a + b;
	}
	
	int add(int[] a) {
		System.out.print("int add(int[] a) - ");
		
		int result = 0;
		
		for(int i = 0; i < a.length; i++) {
			result += a[i];
		}
		return result;
	}
}