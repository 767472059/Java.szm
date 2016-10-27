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
		System.out.println("我是phone类，我的作用是创建物种的一个实例！");
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
		System.out.println("我的型号是"+model);
		
	}

	
	
	

}
