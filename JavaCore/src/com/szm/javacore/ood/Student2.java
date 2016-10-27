package com.szm.javacore.ood;


public class Student2 {
	public static void main(String[]args){
 	Teacher teacher=new Teacher("dudongbin",31,true, null);
 	/*teacher.name="dudongbin";
 	teacher.age=31;
 	teacher.isman=true;
 	teacher.sex=0;*/
 	teacher.teacher("java");
 	System.out.println(teacher.toString());
 	
 	
	
	
	
	

}
}