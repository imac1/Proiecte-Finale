package ArrayLists;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;



public class SortinganArrayList {

	public static <T> void main(String[] args) 
	{

ArrayList <Integer> a =  new ArrayList <>(10);
Random r = new Random ();

for (int i =0; i<16; i++)
{
	a.add(r.nextInt(100));
}

System.out.println("list before sorting "  + a);
 
a.sort(null);

System.out.println("list after sorting with function " + a );


	}

	public void  sort ()

{
		ArrayList <Integer> a =  new ArrayList <>(10);
		Random r = new Random ();

		for (int i =0; i<16; i++)
		{
			a.add(r.nextInt(100));
		}
	int temp=0;
	
	for (int i=0; i<16; i++)
	{
		for (int j=0; j<16; j++)
		{
			if (a.get(i) > a.get(j))
			{
				a.set(i, a.get(j));
				a.set(j, temp);
			}
		}
	}
	return;
}
}

/*Collections.sort(a);

System.out.println("list after sorting in ascending order " + a);
Collections.reverse(a);

System.out.println("list after sorting in descending order " + a);*/