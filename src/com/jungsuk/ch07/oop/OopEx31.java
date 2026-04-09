package com.jungsuk.ch07.oop;

public class OopEx31 {
	class InstancInner{ //인스턴스 내부 클래스
		int iv = 100;
		//static int cv = 100; 사용불가
		final static int CONST = 100;
	}
	
	static class Staticinner{ //static 내부 클래스
		int iv = 200;
		static int cv = 200;
	}
	
	void myMethod() {
		class LocalInner{ //지역 내부 클래스
			int iv = 300;
			//static int cv = 300;
			final static int CONST = 3400;
		}
	}
	
	public static void main(String[] args) {
		System.out.println(InstancInner.CONST);
		System.out.println(Staticinner.cv);
	}
}
