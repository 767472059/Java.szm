package com.szm.javacore.ood5;



public class TPhone extends Phone {
	public  TPhone() {
		System.out.println("����Tphone�࣬wu�����Ĺ��췽�����ҵ������Ǵ������ֵ�һ��ʵ����");
	}
	
	

	@Override
	public void startOS() {
		
	

	}
	public static void main(String[] args) {
	Phone tPhone=new TPhone();
	System.out.println(tPhone);

	}

}
