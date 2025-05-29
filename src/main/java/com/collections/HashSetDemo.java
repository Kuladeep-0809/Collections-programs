package com.collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		
		HashSet hashSet =new HashSet();
		hashSet.add("B");
		hashSet.add("D");
		hashSet.add("A");
		hashSet.add("B");
		hashSet.add("X");
		hashSet.add(null);
		hashSet.add(10);
		hashSet.add(100);
		System.out.println(hashSet.add("X"));//if you try insert duplicate not allowed
		System.out.println(hashSet);
		

	}

}
