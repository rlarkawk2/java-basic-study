package com.jungsuk.ch07.oop;

public class OopEx24 {
	public static void main(String[] args) {
		Fighter f = new Fighter();
		
		if(f instanceof Unit)
			System.out.println("f는 Unit 클래스 자손"); //O
		
		
		if(f instanceof Fightable)
			System.out.println("f는 Fightable 인터페이스를 구현"); //O
		
		
		if(f instanceof Movable)
			System.out.println("f는 Movable 인터페이스를 구현"); //O
		
		
		if(f instanceof Attackable)
			System.out.println("f는 Attackable 인터페이스를 구현"); //O
		
		
		if(f instanceof Object)
			System.out.println("f는 Object의 자손"); //O
		
		
	}
}

class Fighter extends Unit implements Fightable{
	public void move(int x, int y) { //오버라이딩 시 조상 메서드보다 넓은 범위의 접근 제어자 지정 필요
		
	}
	
	public void attack(Unit u) {
		
	}
}

class Unit{
	int currentHP;
	int x;
	int y;
}

 interface Fightable extends Movable, Attackable{

 }

interface Movable{
	void move(int x, int y); //public abstract 생략됨
}

interface Attackable{
	void attack(Unit u);
}