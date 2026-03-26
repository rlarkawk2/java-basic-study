package com.jungsuk.ch07.oop;

/*
 * 예제 7-6
 * super 
 */

public class OopEx6 {
	public static void main(String[] args) {
		Child c = new Child();
		c.method();
	}
}

class Parent{
	int x = 10;
	
	void method() {
		System.out.println("parent method");
	}
}

class Child extends Parent{
	int x = 20;
	
	void method() {
		System.out.println("x : " + x);
		System.out.println("parent.x : " + super.x);
		System.out.println("child.x : " + this.x);
		super.method();
	}
}
