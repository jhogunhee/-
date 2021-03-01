package com.springbook.biz;

/**
  * @FileName : LgTV.java
  * @Project : SpringQuickStart
  * @Date : 2021. 3. 1 
  * @작성자 : rjsgm
  * @변경이력 :
  * @프로그램 설명 : LGTV 클래스에도 SamsungTV클래스와 같은 기능을 수행하는 메소드가 있지만,
  * SamsungTV의 메소드 이름과 다르다.
  */
public class LgTV {
	public void turnOn() {
		System.out.println("LgTV --- 전원 켠다.");
	}
	public void turnOff() {
		System.out.println("LgTV --- 전원 끈다.");
	}
	public void soungUp() {
		System.out.println("LgTV --- 소리 올린다.");
	}
	public void soungDown() {
		System.out.println("LgTV --- 소리 내린다.");
	}
}
