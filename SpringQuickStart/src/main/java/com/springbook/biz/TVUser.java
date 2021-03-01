package com.springbook.biz;

public class TVUser {
	public static void main(String[] args) {
		// 묵시적 형 변환을 이용하여 객체를 참조하면 
		// 참조하는 객체만 변경하면 되므로 객체를 쉽게 변경이 가능
//		TV tv = new SamsungTV();
		TV tv = new LgTV();
		tv.powerOn();
		tv.powerOff();
		tv.volumeUp();
		tv.volumeDown();
		tv.powerOff();
	}
}
