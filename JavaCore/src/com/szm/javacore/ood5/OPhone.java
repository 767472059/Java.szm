package com.szm.javacore.ood5;

public class OPhone extends TPhone {
	public  OPhone() {
		System.out.println("我是Ophone类，wu参数的构造方法，我的作用是创建物种的一个实例！");
	}
	public static void main(String[] args) {
		Phone tPhone=new OPhone();
		System.out.println(tPhone);
	
	}
}
