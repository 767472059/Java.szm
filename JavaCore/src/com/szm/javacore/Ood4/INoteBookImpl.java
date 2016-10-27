package com.szm.javacore.Ood4;

public class INoteBookImpl implements INoteBook {

	@Override
	public void startOS() {
		System.out.println("我是另一个INoteBook接口的实现类，我正在启动系统！");

	}

	@Override
	public void printSelfName() {
		System.out.println("我是另一个INoteBook接口的实现类，我的实现类的名字是： " + this.getClass());

	}

	@Override
	public void usePs() {
		System.out.println("我是另一个INoteBook接口的实现类，我也可以使用PS！ ");
	}

	public static void main(String[] args) {
		INoteBook iiphone1=new INoteBookImpl();
		iiphone1.startOS();
		iiphone1.printSelfName();
		iiphone1.usePs();
		
		System.out.println("************************************************");
		INoteBook impl2 = new TestInterface();
		impl2.startOS();
		impl2.printSelfName();
		impl2.usePs();


	}

}
