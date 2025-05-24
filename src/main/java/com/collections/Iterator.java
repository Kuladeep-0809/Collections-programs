package com.collections;

import java.util.ArrayList;


public class Iterator {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		for (int i = 0 ; i < 20 ; i++) {
			list.add(i);
		}
		System.out.println(list);
		
		java.util.Iterator itr =list.iterator();
		
		while(itr.hasNext()) {
			Integer I =(Integer)itr.next();
			if(I % 2==0) {
				System.out.println(I);
			}else {
				itr.remove();
			}
		}
		
		System.out.println(list);
		

	}

}
