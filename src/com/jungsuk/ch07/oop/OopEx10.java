package com.jungsuk.ch07.oop;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 예제 7-10
 * import
 */

public class OopEx10 {
	public static void main(String[] args) {
		Date today = new Date();
		
		SimpleDateFormat date = new SimpleDateFormat("yyyy/MM/dd");
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		
		System.out.println(date.format(today));
		System.out.println(time.format(today));
	}
}
