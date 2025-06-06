package treeset;

import java.util.TreeSet;

public class TreeSetDemoSorting {

	public static void main(String[] args) {
		//TreeSet treeSet = new TreeSet(new MyComparator());
		
		TreeSet treeSet = new TreeSet(new MyComparatorDemo());
		
		treeSet.add(10);
		treeSet.add(0);
		treeSet.add(20);
		treeSet.add(15);
		treeSet.add(20);
		treeSet.add(20);
		System.out.println(treeSet);
	}

}
