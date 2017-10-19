package ArrayLists;

import java.util.ArrayList;

public class BasicArrayLists1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> ba1 = new ArrayList<>(10);
		
		

		for (int i = 0; i < 10; i++) 
		{
			ba1.add(-113);
		}
		
		int bas = ba1.size();
		
		for (int i=0; i<bas; i++)
		{
			System.out.println("slot " + i + " contains " + ba1.get(i));
			
		}
		System.out.println("list is " + bas);
	}

}
