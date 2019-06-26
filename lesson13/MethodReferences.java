package com.capgemini.lesson13;

import java.time.LocalDate;
import java.time.LocalDateTime;

interface Printable{
	public void print(Object o);
}

class MyShow{
	public MyShow() {
		// TODO Auto-generated constructor stub
	}
	public MyShow(Object o) {
		System.out.println("My Show Constructor: "+o);
	}
	public void play(Object o) {
		System.out.println("Another Object instance method "+o);
	}
	
}
public class MethodReferences {
	
	
	public static void meth1(Object o){
		System.out.println("Static method: "+o);
	}
	public void meth2(Object o){
		System.out.println("Instance method "+o);
	}
	public static void main(String[] args) {
		//Referring Static meth1 method
		Printable p1=MethodReferences::meth1;
		p1.print("Welcome to Method reference");  //print calls static meth1 method
		//Reference to an instance method of a particular object
		MethodReferences ob=new MethodReferences();
		Printable p2=ob::meth2;
		p2.print(LocalDateTime.now()); //print calls meth2 method
		
		//Reference to an instance method of an arbitrary object
		MyShow ob1=new MyShow();
		Printable p3=ob1::play;
		p3.print(new Integer(40)); //print calls play method of MyShow object
		
		Printable p4=MyShow::new;//calling constructor of MyShow
		p4.print(new Item("PC",34000.00));
		
		
		// TODO Auto-generated method stub

	}

}
