package com.treeset;

import java.util.Comparator;

public class MyComparatorStringBuffer implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		String s1 =obj1.toString();
		String s2 =obj2.toString();
		return s1.compareTo(s2);
	}
	
	

}
