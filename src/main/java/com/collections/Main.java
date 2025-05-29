package com.collections;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		List<Emplooye> employee = Arrays.asList(
		new Emplooye ("AICE",7000,1),
		new Emplooye ("Bob",8000,2),
		new Emplooye ("reddy",9000,3),
		new Emplooye ("AICE",10000,4)
		);
		
		Map<Boolean, List<Emplooye>> collect = employee.stream().collect(Collectors.groupingBy(e->e.getName().equals("Bob")));
		
		
		

		//System.out.println(findFirst);
	}

}
