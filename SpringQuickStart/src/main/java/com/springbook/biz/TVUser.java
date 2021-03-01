package com.springbook.biz;

import org.springframework.context.support.GenericXmlApplicationContext;

public class TVUser {
	public static void main(String[] args) {
		// 스프링 컨테이너를 구동한다.
		GenericXmlApplicationContext factory =
				new GenericXmlApplicationContext("/spring/appServlet/servlet-context.xml");
		
		TV tv = (TV) factory.getBean("tv");
		TV tv2 = (TV) factory.getBean("tv");
		
//		tv.powerOff();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.powerOff();
		factory.close();
	}
}
