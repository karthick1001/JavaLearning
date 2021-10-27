package javaBasics;

public class ConstructorDemo 
{
	String name;
	public ConstructorDemo() {
		// TODO Auto-generated constructor stub
		System.out.println("Constructor of constructor demo class " + this.getClass());
	}
	
	public  void method1()
	{
		this.name = "none";
		
	}
}
