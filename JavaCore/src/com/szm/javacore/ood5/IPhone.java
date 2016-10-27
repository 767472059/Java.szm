package com.szm.javacore.ood5;

public class IPhone extends Phone {

	@Override
	public void startOS() {
		System.out.println("我是苹果手机，我正在运行系统"+this.getOs());
		
	}

}
