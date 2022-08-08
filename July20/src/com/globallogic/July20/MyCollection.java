package com.globallogic.July20;

//import java.util.Scanner;

class Student<V,W,X,Y,Z> {
	V id;
	W name;
	X class1;
	Y roll_No;
	Z marks;
	public Student(V id, W name, X class1, Y roll_No, Z marks) {
		
		this.id = id;
		this.name = name;
	    this.class1 = class1;
		this.roll_No = roll_No;
		this.marks = marks;
	}
	void print()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(class1);
		System.out.println(roll_No);
		System.out.println(marks);
	}
}

public class MyCollection {
	public static void main(String[] args) {
	//Scanner sc=new Scanner(System.in);
	Student<Integer,Integer,Integer,Integer,Integer> st=new Student<Integer,Integer,Integer,Integer,Integer>(1001,199,10,16,99);
	st.print();
	}
}
