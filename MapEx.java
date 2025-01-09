package com.cts.collections;

import java.util.TreeMap;

public class MapEx {

	public static void main(String[] args) {
		TreeMap<Integer, String> emps = new TreeMap<Integer, String>();
		emps.put(123, "suresh");
		emps.put(9012, "naresh");
		emps.put(12312, "rajesh");
		emps.put(8, "pavan");
		emps.put(22, "mahesh");
		emps.put(123, "samarth");

		System.out.println(emps);
	}

}
