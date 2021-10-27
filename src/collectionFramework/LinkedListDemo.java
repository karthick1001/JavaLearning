package collectionFramework;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

class LinkedListDemo  {

	

	public static void main(String[] args) {
		List<String> A1 = new LinkedList<String>(Arrays.asList("a", "as", "asdfag"));
		A1.add(1, "mass");
		System.out.println(A1);
		// Collections.sort(A1);
		A1.add(0, "str");
		System.out.println(A1);
		A1.add(2, "auto");
		System.out.println(A1);
		A1.size();
		
	}

}
