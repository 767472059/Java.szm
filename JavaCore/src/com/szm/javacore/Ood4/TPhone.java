package com.szm.javacore.Ood4;

public class TPhone implements Iiphone {

	@Override
	public void startOS() {
		System.out.println("我是实现了INoteBook接口，我可以使用PS的修图软件");// TODO Auto-generated method stub

	}

	@Override
	public void printSelfName() {
		System.out.println("我是锤子手机，我实现了IiPhone接口的 printSelfName方法！");// TODO Auto-generated method stub

	}
	
	
	

	public static void main(String[] args) {
		Iiphone iiPhone = new TPhone();
		iiPhone.startOS();
		iiPhone.printSelfName();
	}

}
