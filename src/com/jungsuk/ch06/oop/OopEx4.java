package com.jungsuk.ch06.oop;

/*
 * 예제 6-4
 * 객체배열 만들고 객체 선언하기
 */

class Tv4{
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

public class OopEx4 {
	public static void main(String[] args) {
		Tv4[] tvArr = new Tv4[3]; //객체 배열 선언
		
		for(int i = 0; i < tvArr.length; i++) {
			tvArr[i] = new Tv4(); //객체 생성
			tvArr[i].channel = i + 1; //객체별로 다르게 채널 세팅
			System.out.println( i + 1 + "번째 TV의 채널은 -> " + tvArr[i].channel);
		}
	}
}