package com.jungsuk.ch07.oop;

/*
 * 예제 7-17
 * instanceof 
 */

public class OopEx17 {
	public static void main(String[] args) {
		FireEngine fe = new FireEngine();
		
		if(fe instanceof FireEngine) {
			System.out.println("fireEngine");
		}
		
		if(fe instanceof Car) {
			System.out.println("Car");
		}
		
		if(fe instanceof Object) {
			System.out.println("Object");
		}
		
		System.out.println(fe.getClass().getName());
	}
}