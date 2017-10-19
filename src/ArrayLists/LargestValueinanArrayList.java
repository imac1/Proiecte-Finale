package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class LargestValueinanArrayList {

	public static void main(String[] args) {
		ArrayList <Integer> a = new ArrayList <>(10);
		Random r = new Random();
		for (int i=0; i<10; i++)
		{
			a.add(r.nextInt(100));
		}
		System.out.println(a);
		
		int maxvalue = Collections.max(a); // getting the largest value
		int minvalue = Collections.min(a);// getting the minimum value
		Object o = maxvalue; // creates an object associated to a variable
	
		System.out.println("the maximum value is " + maxvalue);
		System.out.println(maxvalue + " is at index " + a.indexOf(o)); // gets index of a specific variable
		System.out.println("the minimum value is " + minvalue);
	}

}
