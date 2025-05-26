package com.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class Listiterator {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add("kuladeep");
		list.add("reddy");
		list.add("Mittapalli");
		list.add("TCS");
		list.add("Java developer");
		list.add("Software");
		System.out.println("Before listiteration:"+list);
		ListIterator itr = list.listIterator();
		
		while(itr.hasNext()) {
			String str =(String)itr.next();
			if(str.equals("Kuladeep")) {
				itr.remove();
			}
			else if(str.equals("reddy")) {
				itr.add("super");
			}
			else if (str.equals("Software")) {
				itr.set("superkings");
			}
		}
		
		System.out.println("After listiteration:"+list);

	}

}
