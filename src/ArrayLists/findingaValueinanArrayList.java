package ArrayLists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class findingaValueinanArrayList {

	public static void main(String[] args) {
		ArrayList <Integer> a1 = new ArrayList<>(10);
		Random r = new Random();
		Scanner s = new Scanner(System.in);

		for (int i=0; i<10; i++)
		{
			a1.add(r.nextInt(50));
		}
		
		System.out.println("here are the values " + a1);
		System.out.println("choose a value");
		int value = s.nextInt();
		
		Object o = value;
		a1.contains(o );
		
		if (a1.contains(o))
		{
			System.out.println(value + " is in the list");
		}
		else 
			System.out.println( value + " is not in the list");
		s.close();
	}

}
