package com.szm.javacore.ood5;

public class TestPhone {

	public static void main(String[] args) {
		Phone phone=new IPhone();
		phone.startOS();
		Phone phone2=new MPhone();
		phone2.startOS();
		Phone phone3=new MPhone();
			phone3.setModel("mi mix");
			phone3.printself();
			Phone tPhone=new OPhone();
			
			System.out.println(tPhone);


			
	
		
			}
		
	

	}


