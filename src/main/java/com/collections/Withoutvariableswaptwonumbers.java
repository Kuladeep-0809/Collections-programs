package com.collections;

public class Withoutvariableswaptwonumbers {
	
	public static void main(String[] args) {
		int x= 10 ;
		int y =20 ;
		
		x = x+y; //x+y = 30 x=30
		y= x-y;//30-20; y =10;
		x=x-y;//30-10=20
		System.out.println(x);
		System.out.println(y);
	}

}
