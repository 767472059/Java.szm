package com.szm.javacore.Ood4;

public class TPhone implements Iiphone {

	@Override
	public void startOS() {
		System.out.println("����ʵ����INoteBook�ӿڣ��ҿ���ʹ��PS����ͼ���");// TODO Auto-generated method stub

	}

	@Override
	public void printSelfName() {
		System.out.println("���Ǵ����ֻ�����ʵ����IiPhone�ӿڵ� printSelfName������");// TODO Auto-generated method stub

	}
	
	
	

	public static void main(String[] args) {
		Iiphone iiPhone = new TPhone();
		iiPhone.startOS();
		iiPhone.printSelfName();
	}

}
