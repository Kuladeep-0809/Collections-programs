package com.treeset;

import java.util.TreeSet;

public class TreeSetString {

	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet(new MyComparatorString());
		
		treeSet.add("kuladeep");
		treeSet.add("super");
		treeSet.add("king");
		treeSet.add("Tiger");
		treeSet.add("Lion");
		
		System.out.println(treeSet);

	}

}
