package com.jungsuk.ch07.oop;

public class OopEx25 {
	public static void main(String args[]) {
		Parseable parser = ParserManager.getParser("XML"); //인터페이스 클래스 참조변수에 해당 인터페이스를 구현한 클래스의 인스턴스 생성
		parser.parse("document");
		parser = ParserManager.getParser("HTML");
		parser.parse("document2");
	}
}

/* 인터페이스 */
interface Parseable{
	public abstract void parse(String fileName); //자손은 이 메서드를 반드시 구현해야 함
}

/* 클래스 */
class ParserManager{
	public static Parseable getParser(String type) { //메서드
		if(type.equals("XML")) {
			return new XMLParser();
		} else {
			Parseable parseable = new HTMLParser();
			return parseable;
		}
	}
}

class XMLParser implements Parseable{  
	public void parse(String fileName) { //인터페이스 메서드 구현
		System.out.println(fileName + ".xml parsing");
	}
}

class HTMLParser implements Parseable{
	public void parse(String fileName) { //인터페이스 메서드 구현
		System.out.println(fileName + "html parsing");
	}
}
