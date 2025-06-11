package com.treesetStringBufferAndString;

import java.util.TreeSet;

import com.treeset.MyComparatorStringBuffer;

public class TreeSetStringAndStringBuffer {

	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet(new MyComparatorStringAndStringBuffer());

		treeSet.add("A");
		treeSet.add(new StringBuffer("ABC"));
		treeSet.add(new StringBuffer("AB"));
		treeSet.add("XX");
		treeSet.add("ABCD");
		treeSet.add("A");
		

		System.out.println(treeSet);
	}

}
