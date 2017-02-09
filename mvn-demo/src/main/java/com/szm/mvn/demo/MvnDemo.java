package com.szm.mvn.demo;

import org.omg.CORBA.PUBLIC_MEMBER;

import lombok.Getter;
import lombok.Setter;
@Setter @Getter
public class MvnDemo {
	private String name;
	public MvnDemo(String name) {
		super();
		this.name = name;
	}
	public MvnDemo() {
		//super();
	}
	
		public String sayHello(){
			return "Hello Maven!"+"my name is"+this.getName();
		}

	public static void main(String[] args) {
	  HelloWorldDemo hwd=new HelloWorldDemo();
	  System.out.println("Hello Maven!");
	  System.out.println(hwd.sayHelloWorld());

	}


	

	
}
