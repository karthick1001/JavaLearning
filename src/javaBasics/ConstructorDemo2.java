package javaBasics;

public class ConstructorDemo2 extends ConstructorDemo

{
	public ConstructorDemo2()
	{
		//this("This is Constructor Demo2 constructor");
		System.out.println("This");
	}
	
	public ConstructorDemo2(String data)
	{
		System.out.println(data);
		super.method1();
	}
	
	public static void main(String[] args) {
		ConstructorDemo2 cons = new ConstructorDemo2();
		String a = "1";
		int b = 1;
		String x = a.valueOf(b);
		System.out.println(a);
		
		
	}
	
	
	
	
	
}
