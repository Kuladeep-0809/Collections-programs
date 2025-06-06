package com.treeset;

import java.util.Comparator;

public class MyComparatorString implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		String S1 = obj1.toString();
		String s2 =(String)obj2;
		//return s2.compareTo(S1);
		//return -S1.compareTo(s2);
		
		return S1.compareTo(s2);
	}
	
}
