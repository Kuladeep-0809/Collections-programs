package com.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet hashSet = new LinkedHashSet();
		hashSet.add("B");
		hashSet.add("D");
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("X");
		hashSet.add(null);
		hashSet.add(10);
		hashSet.add(100);
		System.out.println(hashSet.add("X"));
		System.out.println(hashSet);
		

	}

}
