package com.szm.javacore.ood5;



public class TPhone extends Phone {
	public  TPhone() {
		System.out.println("我是Tphone类，wu参数的构造方法，我的作用是创建物种的一个实例！");
	}
	
	

	@Override
	public void startOS() {
		
	

	}
	public static void main(String[] args) {
	Phone tPhone=new TPhone();
	System.out.println(tPhone);

	}

}
