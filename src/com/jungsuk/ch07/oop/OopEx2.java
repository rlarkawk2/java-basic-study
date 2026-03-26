package com.jungsuk.ch07.oop;

/*
 * 예제 7-2
 * 상속, 포함관계
 */

public class OopEx2 {
	public static void main(String[] args) {
		Point[] p = {
				new Point(100,100),
				new Point(200,200),
				new Point(300,300)
		};
		
		Triangle t = new Triangle(p);
		Circle c = new Circle(new Point(150,150), 50);
		
		t.draw();
		c.draw();
	}
}

class Shape{
	String color = "black";
	
	void draw(){
		System.out.println("color : " + color);
	}
}

class Point{
	int x, y;
	
	Point(){
		this(0,0);
	}

	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	String getXY() {
		return "(" + x + ", " + y + ")";
	}
}

class Circle extends Shape{ //상속
	Point center; //포함관계
	int r;
	
	Circle(){
		this(new Point(0,0), 100);
	}
	
	Circle(Point center, int r){
		this.center = center;
		this.r = r;
	}
	
	void draw() {
		System.out.printf("center : %d.%d, r = %d, color = %s\n", center.x, center.y, r, color);
	}
}

class Triangle extends Shape{ //상속
	Point[] p = new Point[3]; //포함관계
	
	Triangle(Point[] p) {
		this.p = p;
	}
	
	void draw(){
		System.out.printf("p = %s, p2 = %s, p3 = %s, color = %s\n", p[0].getXY(), p[1].getXY(),p[2].getXY(),color);
	}
}