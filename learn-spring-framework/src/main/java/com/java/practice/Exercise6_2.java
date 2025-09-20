package com.java.practice;

public class Exercise6_2 {

	public static void main(String[] args) {
		Student s = new Student("홍길동", 1,1,100,60,76);
		String str = s.info();
		System.out.println(str);

	}

}

class Student{
	String name;
	int a;
	int b;
	int c;
	int d;
	int e;
	
	Student(){}
	
	Student(String name, int a, int b, int c, int d, int e){
		this.name = name;
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
		this.e = e;
	}
	
	String info() {
		return name + "," + a + "," +  b + "," + c + "," + d + "," + e;
	}
}
