package treeset;

import java.util.Comparator;

public class MyComparatorDemo implements Comparator{

	@Override
	public int compare(Object obj1, Object obj2) {
		Integer I1 =(Integer)obj1;
		Integer I2 =(Integer)obj2;
		//ascending order
		//return I1.compareTo(I2);
		
		//Descending order
		return -I1.compareTo(I2);
		
		////Descending order
		//return I2.compareTo(I1);
		
		//ascending order
		//return -I2.compareTo(I1);
		
		
		//Insertion order
		//return +1;
		
		
		//reverse of insertion order
		
		//return -1;
		
		
		
		//return 0;
	}
	
	

}
