package ArrayLists;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class ArrayListWhereIsIt {

	public static void main(String[] args) {
		ArrayList <Integer> a = new ArrayList<>(10);
		Random r = new Random();
		Scanner s = new Scanner(System.in);
		
		
		for (int i=0; i<10; i++)
		{
		a.add(r.nextInt(100));	
		}

		System.out.println(a);
		System.out.println("enter a value");
		int v = s.nextInt();
		
		Object value = v;
		a.contains(value);
		if (a.contains(value))
		{
			System.out.println( value + " is in the list");
			System.out.println(value + " is found at position " + a.indexOf(value));
		}
		else 
			System.out.println(value + "is not int he list");
	}

}
