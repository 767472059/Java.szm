package com.szm.javacore.Ood4;

public class INoteBookImpl implements INoteBook {

	@Override
	public void startOS() {
		System.out.println("������һ��INoteBook�ӿڵ�ʵ���࣬����������ϵͳ��");

	}

	@Override
	public void printSelfName() {
		System.out.println("������һ��INoteBook�ӿڵ�ʵ���࣬�ҵ�ʵ����������ǣ� " + this.getClass());

	}

	@Override
	public void usePs() {
		System.out.println("������һ��INoteBook�ӿڵ�ʵ���࣬��Ҳ����ʹ��PS�� ");
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
