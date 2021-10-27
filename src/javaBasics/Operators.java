package javaBasics;

final class Operators extends Array
{
	public static void methodArray()
	{
		System.out.println("methodArray in array parent class");
	}
	
	public static void main(String[] args)
	{
		
		
		
		// Arithmatic operator "+" and assignment operator "="
		int output = 1 + 3;
		int result = output;
		System.out.println("addition of 1 + 3 is " + output);
		
		// Sub
		output = 5 - 1;
		System.out.println("5 - 1 = " + output);
		result = output;
		
		//Multiplication
		output = 10*4;
		System.out.println("10 * 4 = "+ output);
		result = output;
		
		// Division
		output = 50/5;
		System.out.println("50 / 5 = "+ output);
		result = output;
		
		// Modulus
		output = 7 % 3;
		System.out.println("7 % 3 = " + output);
		result = output;
		
		/////////////////////////////////////////////////
		
		
		//post and pre increment or decrement
		
		int random = 5;
		random++;		
		System.out.println(random);
		
		++random;
		System.out.println(random);
		
		System.out.println(random++);
		
		System.out.println(random);
		System.out.println(++random);
		
		
		
	}
}
