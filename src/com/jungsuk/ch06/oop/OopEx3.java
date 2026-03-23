package com.jungsuk.ch06.oop;

/*
 * 예제 6-3
 * 참조변수 두 개를 만들고, 하나의 참조변수의 값을 다른 참조변수의 값으로 대체
 */
class Tv3{
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

public class OopEx3 {
	public static void main(String[] args) {
		
		//각 참조변수별로 개별 인스턴스를 바라보는 주소가 저장됨
		Tv3 tv1 = new Tv3();
		Tv3 tv2 = new Tv3();
		
		tv1.channel = 10;
		tv2.channel = 1;
		
		System.out.println("첫 번째 Tv 채널 : " + tv1.channel);
		System.out.println("두 번째 Tv 채널 : " + tv2.channel);
		
		//tv2의 참조변수 값을 tv1의 참조변수 값으로 변경
		tv2 = tv1;
		
		//tv2에 담긴 주소값이 tv1 주소값으로 변경 -> 같은 인스턴스를 바라보게 됨
		System.out.println("첫 번째 Tv 채널 : " + tv1.channel);
		System.out.println("두 번째 Tv 채널 : " + tv2.channel);
	}
}
