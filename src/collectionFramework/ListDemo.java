package collectionFramework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListDemo {

	public static void main(String[] args) {
		
		List a = new ArrayList();
		a.add("fall");
		a.add("wall");
		a.add(1);
		
		//System.out.println(a);
		a.forEach(element-> System.out.println(element));
		a.stream().forEach(ele-> System.out.println(ele));
		
		//System.out.println(a);
		
		ArrayList list = new ArrayList();
		list.add("hfsdds");
		list.add("assun");
		list.add("dasf");
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
		
		Object as = list.clone();
		System.out.println(as);
		
		System.out.println(list);
		System.out.println(as);
		
		System.out.println("-------------------");
		
		ArrayList<Integer> Numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
		Numbers.removeIf(ele -> ele%2 != 0);
		System.out.println(Numbers);
		
		Iterator lt = list.iterator();
		lt.hasNext();
		
		List<String> omg = new ArrayList<String>(Arrays.asList("hi", "how"));
		int num = omg.size();
		System.out.println(num);
		omg.addAll(list);
		for(String i : omg)
		{
			System.out.println(i);
		}
		
		System.out.println();
		
		List<String> A1 = new ArrayList<String>(Arrays.asList("a", "as", "asdfag"));
		A1.add(1, "mass");
		System.out.println(A1);
		//Collections.sort(A1);
		A1.add(2, "adfagdfddhh");
		System.out.println(A1);
		A1.add(2, "auto");
		System.out.println(A1);
		A1.add(null);
		A1.add(null);
		System.out.println(A1);
		
		A1.addAll(list);
		System.out.println(A1);
		
		List<String> A2 = new ArrayList<String>(Arrays.asList("a", "mass", "auto", "adfagdfddhh"));
		A2.retainAll(A1);
		System.out.println(A2);
		Collections.sort(A2, Collections.reverseOrder());
		System.out.println(A2);
		
	}

}
