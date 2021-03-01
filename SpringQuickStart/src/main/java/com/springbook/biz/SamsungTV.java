package com.springbook.biz;

/**
  * @FileName : SamsungTV.java
  * @Project : SpringQuickStart
  * @Date : 2021. 3. 1 
  * @작성자 : rjsgm
  * @변경이력 :
  * @프로그램 설명 : SamsungTV 클래스는 TV인터페이스에 선언된
  * 추상 메서드들을 재정의해야한다.
  */
public class SamsungTV implements TV{
	public void powerOn() {
		System.out.println("SamsungTV --- 전원 켠다.");
	}
	public void powerOff() {
		System.out.println("SamsungTV --- 전원 끈다.");
	}
	public void volumeUp() {
		System.out.println("SamsungTV --- 소리 올린다.");
	}
	public void volumeDown() {
		System.out.println("SamsungTV --- 소리 내린다.");
	}
}
