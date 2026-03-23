package com.jungsuk.ch06.oop;

/*
 * 예제 6-2
 * Tv 클래스를 만들고 두 개의 Tv 클래스의 인스턴스를 생성
 */
class Tv2{
	boolean power;
	int channel;
	
	public void power() {
		power = !power;
	}
	
	public void channelUp() {
		channel++;
	}
	
	public void channelDown() {
		channel--;
	}
}

public class OopEx2 {
	public static void main(String[] args) {
		//두 개의 Tv 클래스의 인스턴스 생성 가능
		Tv2 tv1 = new Tv2();
		Tv2 tv2 = new Tv2();
		
		//인스턴스별 멤버변수는 따로 관리됨
		tv1.channel = 10;
		tv2.channel = 1;
		
		System.out.println("첫 번째 TV의 채널 : " + tv1.channel);
		System.out.println("두 번째 TV의 채널 : " + tv2.channel);
		
		//인스턴스별 메서드 역시 따로 관리됨
		tv1.channelDown();
		tv2.channelUp();
		
		System.out.println("첫 번째 TV의 채널 : " + tv1.channel);
		System.out.println("두 번째 TV의 채널 : " + tv2.channel);
	}
}
