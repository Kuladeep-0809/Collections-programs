package com.treeset;

import java.util.TreeSet;

public class TreeSetStringBuffer {

	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet(new MyComparatorStringBuffer());

		treeSet.add(new StringBuffer("A"));
		treeSet.add(new StringBuffer("C"));
		treeSet.add(new StringBuffer("B"));
		treeSet.add(new StringBuffer("X"));
		treeSet.add(new StringBuffer("M"));

		System.out.println(treeSet);
	}

}
