package com.szm.javacore.Ood4;

public class TestInterface implements Iiphone, INoteBook {

	@Override
	public void usePs() {
		// TODO Auto-generated method stub
		System.out.println("����ʵ����INoteBook�ӿڣ��ҿ���ʹ��PS����ͼ���");
	}

	@Override
	public void startOS() {
		// TODO Auto-generated method stub
		System.out.println("���Ǵ����ֻ�����ʵ����IiPhone�ӿڵ� printSelfName������");
	}

	@Override
	public void printSelfName() {
		System.out.println("���Ǵ����ֻ�����ʵ����IiPhone�ӿڵ� printSelfName������");//System.out.println("���Ǵ����ֻ�����ʵ����IiPhone�ӿڵ� printSelfName������") TODO Auto-generated method stub

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
