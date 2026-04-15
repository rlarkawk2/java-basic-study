package com.jungsuk.ch09.lang;

public class Ex02 {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode());
		System.out.println(str2.hashCode()); //String 클래스 > 문자열 내용이 같으면 동일한 해시코드 반환
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2)); //identityHashCode > 주소값으로 해시코드 생성 > 다름
	}
}
