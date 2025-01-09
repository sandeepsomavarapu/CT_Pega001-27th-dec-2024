package com.cts.collections;

import java.util.ArrayList;
import java.util.LinkedList;

//1.both homogeneous and heterogeneous data is allowed 
//2.not fixed in size   AL--10---(CC*3/2)+1
//3.lots of utility methods
//4.duplicates are allowed 
//5.insertion order is preserved 	

public class ArrayListEx {
	public static void main(String[] args) {//
		LinkedList<String> names = new LinkedList<String>();// 10
		names.add("akash");
		names.add("koshiga");
		names.add("bharath");
		names.add("vikas");
		names.add("rakesh");
		names.add("akash");
		names.add("satvika");
		names.add("jahnavi");
		System.out.println(names);
		names.remove("jahnavi");
		System.out.println(names);
		ArrayList<String> names1 = new ArrayList<String>();// 10
		names1.add("samarth");
		System.out.println(names1);
		names1.addAll(names);
		System.out.println(names1);
//			names1.removeAll(names);
		names1.retainAll(names);
		System.out.println(names1);

//		Iterator<String> itr = names.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//		}
		
		for(Object name:names)
		{
			System.out.println(name);
		}

	}
}
