package com.szm.javacore.ood3;

public class One {
	int a=5;
	
	public static void main(String[] args) {
		int[] intArrary = { 00, 77, 22, 99, 44, 55 };// 声明一个int类型的数组
		int[] intArray = new int[3];

		// Copy Array
		System.arraycopy(intArrary, 3, intArray, 0,3);
		
		for (int i : intArray) {
			System.out.println(i);
			System.out.println();
		}

}
}