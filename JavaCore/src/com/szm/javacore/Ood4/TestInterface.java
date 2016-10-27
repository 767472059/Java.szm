package com.szm.javacore.Ood4;

public class TestInterface implements Iiphone, INoteBook {

	@Override
	public void usePs() {
		// TODO Auto-generated method stub
		System.out.println("我是实现了INoteBook接口，我可以使用PS的修图软件");
	}

	@Override
	public void startOS() {
		// TODO Auto-generated method stub
		System.out.println("我是锤子手机，我实现了IiPhone接口的 printSelfName方法！");
	}

	@Override
	public void printSelfName() {
		System.out.println("我是锤子手机，我实现了IiPhone接口的 printSelfName方法！");//System.out.println("我是锤子手机，我实现了IiPhone接口的 printSelfName方法！") TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Iiphone iiPhone = new TestInterface();
		INoteBook iNoteBook = new TestInterface();

		iiPhone.startOS();
		iiPhone.printSelfName();

		iNoteBook.usePs();
		
		// TODO Auto-generated method stub
	}

}
