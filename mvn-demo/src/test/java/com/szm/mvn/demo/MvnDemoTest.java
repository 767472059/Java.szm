package com.szm.mvn.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class MvnDemoTest {

	@Test
	public void testSayHello() {
		 MvnDemo md=new  MvnDemo("zhangsan");
		 System.out.println(md.sayHello());
		 assertEquals("Hello Maven!my name iszhangsan", md.sayHello());
		
	}

}
 