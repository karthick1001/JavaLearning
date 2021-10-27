package javaBasics;

public class NonPremitiveDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Strings => Strings are special class in java, they are immutable
		String a = "string";
		
		String b = new String("newstring");
		
		System.out.println(a + " " + b);
		
		// Array
		int[] c = new int[2];
		c[0] = 1;
		c[1] = 3;
		
		int[] d = {1, 2, 3};
		
		System.out.println(d[1]);
		
		
	}

}
