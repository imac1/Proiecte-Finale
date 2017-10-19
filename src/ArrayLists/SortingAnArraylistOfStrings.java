package ArrayLists;

import java.util.ArrayList;
import java.util.Collections;

public class SortingAnArraylistOfStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a = new ArrayList<>(5);
		

		for (int i = 0; i < 1; i++) 
		{
			a.add("and");
			a.add("or");
			a.add("but");
			a.add("in");

		}

			System.out.println("string list before sorting " + a);
			
		Collections.sort(a);
		System.out.println("string after sorting with function " + a );
		
		
	}
			public void sortstring()
			 {
				String temp;
				ArrayList<String> a = new ArrayList<>(5);
				
				for (int i=0; i<5; i++)
				{
					for (int j=0; j<5; j++)
					{
						temp = a.get(i); // create a temporary string element to replace a position in the arraylist 
						a.set(i,a.get(j)); // Replaces the element at the specified position in this list with the specified element.
						a.set(j, temp); // 
							
						}
					}
				 return;
			 }
			
			
		
	}

/*System.out.println("string list after sorting " + a );
			Collections.reverse(a);
			System.out.println("string in reverse oreder " + a);*/
