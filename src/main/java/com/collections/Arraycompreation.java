package com.collections;

import java.util.Arrays;

public class Arraycompreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] a1 = {"two","one"};
		String[] a2 = {"one","two"};
		
		boolean arrayEquals = false;
		
		arrayEquals =  Arrays.stream(a1).unordered()
				.allMatch(elements -> Arrays.stream(a2).anyMatch(elements::equals));
		System.out.println(arrayEquals);
	}

}
