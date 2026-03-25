package com.jungsuk.ch06.oop;

/*
 * 예제 6-27
 * 초기화 블럭
 */

public class OopEx27 {
	
	//클래스 초기화 블럭 -> 클래스 메모리 로딩 시 실행
	static {
		System.out.println("static { }");
	}
	
	//인스턴스 초기화 블럭 -> 인스턴스 생성 시 실행
	{
		System.out.println("{ }");
	}
	
	//초기화 블럭 실행 후 실행
	public OopEx27(){
		System.out.println("생성자");
	}
	
	public static void main(String[] args) {
		System.out.println("1");
		OopEx27 op = new OopEx27();

		System.out.println("2");
		OopEx27 op2 = new OopEx27();
	}
}
