package com.szm.javacore.ood;

    public class Teacher{
		String name;
		Integer age;
		Boolean isman;
		Byte sex;//0....男，1....nv
		
		
		
		
		
		public Teacher() {
			//super();
			System.out.println("woshiwucan");
		}
		
		
		
		
		public Teacher(String name, Integer age, Boolean isman, Byte sex) {
			//super();
			this.name = name;
			this.age = age;
			this.isman = isman;
			this.sex = sex;
			System.out.println("woshiwucan");
		}
		




		public Teacher(String name, Integer age) {
			super();
			this.name = name;
			this.age = age;
		}




		public void teacher(String course){
			System.out.println("老师"+name+"教授的课程是"+course);
			
			
			
		}
		@Override
		public String toString() {
		
		String tmp="Teacher [name=" + name + ", age=" + age + ", isman=" + isman + ", sex=" + sex + "]";
		return tmp;
		}
		
		
		
		
	}


