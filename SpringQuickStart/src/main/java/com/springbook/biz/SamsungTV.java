package com.springbook.biz;

import java.util.ArrayList;

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
	
	SonySpeaker speaker;
	
	public SamsungTV() {
		System.out.println("===> SamsungTV(1) 객체 생성");
	}
	
	public SamsungTV(SonySpeaker speaker) {
		System.out.println("===> SamsungTV(2) 객체 생성");
		this.speaker = speaker;
	}
	
	public void initMethod() {
		ArrayList<String> List = new ArrayList<>();			
		List.add("test1");
		List.add("test2");
		List.add("test3");
		List.add("test4");
		List.add("test5");
		System.out.println(List.toString());
	}
	
	public void destroyMethod() {
		System.out.println("객체 삭제 전 처리");
	}
	
	public void powerOn() {
		System.out.println("SamsungTV --- 전원 켠다.");
	}
	public void powerOff() {
		System.out.println("SamsungTV --- 전원 끈다.");
	}
	public void volumeUp() {
		speaker.volumeUp();
	}
	public void volumeDown() {
		speaker.volumeDown();
	}
}
