package com.szm.javacore.ood5;

public abstract class Phone {
	private String model;
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
		
	}

	public void Phone() {
		//super();
		System.out.println("����phone�࣬�ҵ������Ǵ������ֵ�һ��ʵ����");
	}

	//private String vender;
	
	private String os="androin";
	
	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	public abstract void  startOS();
	public void printself(){
		System.out.println("�ҵ��ͺ���"+model);
		
	}

	
	
	

}
