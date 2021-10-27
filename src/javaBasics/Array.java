package javaBasics;

import java.util.Arrays;

class Array {
	
	/*public static void methodArray()
	{
		System.out.println("methodArray in array parent class");
	}
	*/
	public static void main(String args[]) {
		int[] a = new int[5];
		a[0] = 1;
		a[1] = 3;
		a[3] = 5;
		a[2] = 7;
		a[4] = 9;
		
		
		
		System.out.println(a[2]); 
		
		
		
		
		
		String b[] = new String[5];
		b[4] = "1";
		System.out.println(b[4]);

		int[] c = { 1, 2, 3, 4 };
		System.out.println(c[1]);

		int[] d = new int[3];

		System.arraycopy(c, 0, d, 0, 3);
		System.out.println(d[1]);

		System.out.println("######################");

		// Get the Array
		int intArr[] = { 10, 20, 15, 22, 35 };

		int intArr2[] = { 10, 20, 15, 30 };

		// sort the array
		/*
		 * Arrays.sort(intArr);
		 * 
		 * for(int i =0; i<intArr.length; i++) { System.out.print(" " + intArr[i]); }
		 */
		System.out.println();
		intArr[3] = 30;

		for (int i = 0; i < intArr.length; i++) {
			System.out.print(" " + intArr[i]);
		}
		System.out.println();
		Arrays.sort(intArr);
		for (int i = 0; i < intArr.length; i++) {
			System.out.print(" " + intArr[i]);
		}
		System.out.println();
		System.out.println(Arrays.binarySearch(intArr, 15));
		Arrays.sort(intArr2);
		System.out.println(Arrays.equals(intArr, intArr2));

		System.out.println(Arrays.toString(intArr));
		System.out.println(intArr[-1]);
	}
}
