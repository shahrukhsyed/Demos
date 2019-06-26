package com.capgemini.lesson13;

@FunctionalInterface
interface SayHello{
	public void say();
	//public void show(); //error
}

interface PrintMsg{
	public void print(String str);
	//public void show(); //no error
}

interface LengthFinder{
	public int findLength(String str);
}

interface Calculator{
	public double add(double a,double b);
}
interface Calc{
	public int mul(int a, int b, int c);
}
interface Calci{
	public int div(int a, int b);
}

public class LambdaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SayHello s=()->System.out.println("Hello Shahrukh");
		s.say();
		PrintMsg msg=str->System.out.println(str);
		msg.print("Shahrukh");
		
		//LengthFinder find=(l)->l.length();
		
		
		LengthFinder i=(String a)->{
			int leng=a.length();
			return leng;
		};
		int len=i.findLength("Shahrukh");
		System.out.println(len);
		
		Calculator c=(a,b)->a+b;
		double total=c.add(4,5);
		System.out.println(total);
		
		Calc d=(a1,b1,c1)->a1*b1*c1;
		int result=d.mul(2,3,4);
		System.out.println(result);
		
		Calci e=(a2,b2)->a2/b2;
		int r=e.div(6, 2);
		System.out.println(r);
		
	}

}
