package com.springbook.biz;

/**
  * @FileName : LgTV.java
  * @Project : SpringQuickStart
  * @Date : 2021. 3. 1 
  * @작성자 : rjsgm
  * @변경이력 :
  * @프로그램 설명 : LgTV 클래스는 TV인터페이스에 선언된 추상메소드들을 재정의 하여야한다. 
  */
public class LgTV implements TV{

	@Override
	public void powerOn() {
		System.out.println("LgTV --- 전원 켠다.");
	}
	@Override
	public void powerOff() {
		System.out.println("LgTV --- 전원 끈다.");
	}
	@Override
	public void volumeUp() {
		System.out.println("LgTV --- 소리 올린다.");
	}
	@Override
	public void volumeDown() {
		System.out.println("LgTV --- 소리 내린다.");
	}
}
