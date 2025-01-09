package com.cts.collections;

import java.util.TreeSet;

//1.both homogeneous and heterogeneous data is allowed 
//2.not fixed in size   
//3.lots of utility methods
//4.duplicates are not allowed 
//5.insertion order is not preserved 	

public class SetEx {
	public static void main(String[] args) {//
		TreeSet<String> names = new TreeSet<String>();// 10
		names.add("akash");
		names.add("koshiga");
		names.add("bharath");
		names.add("vikas");
		names.add("rakesh");
		names.add("akash");
		names.add("satvika");
		names.add("jahnavi");
		System.out.println(names);
	

	}
}
