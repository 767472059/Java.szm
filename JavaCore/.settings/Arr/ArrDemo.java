package com.szm.javacore.Arr;



public class ArrDemo {
public static void main(String[] args){

		
		int[] intArrary = {00, 77, 22, 99, 44, 55 };// ����һ��int���͵�����
		int[] intArray = new int[4];
	    System.arraycopy(intArrary,0, intArrary, 0, 2);
				for (int i : intArray) {
					System.out.println(i);
					
		
	}
}
}
