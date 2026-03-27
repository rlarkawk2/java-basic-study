package com.jungsuk.ch07.oop;

/*
 * 예제 7-8
 * 조상 생성자 super()
 */

public class OopEx8 {
	public static void main(String[] args) {
		Point3D p = new Point3D();
		
		System.out.println(p.x); //100
		System.out.println(p.y); //200
		System.out.println(p.z); //300
	}
}

class Point2{
	int x = 10;
	int y = 20;
	
	Point2(int x, int y){
		this.x = x;
		this.y = y;
	}
}

class Point3D extends Point2{
	int z = 30;
	
	public Point3D() {
		this(100,200,300);
	}
	
	Point3D(int x, int y, int z){
		super(x, y);
		this.z = z;
	}
}
