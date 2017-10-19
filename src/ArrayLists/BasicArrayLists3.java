package ArrayLists;

import java.util.ArrayList;
import java.util.Random;

public class BasicArrayLists3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> ba3 = new ArrayList<>(25);
		Random r = new Random();
		int i=0;
		
		
		for ( i=0; i<1000; i++)
		{
			ba3.add(10 + r.nextInt(90));
		}
		
			
				System.out.print(ba3 + "/t");
			//}
		
		}
	}

/*i=0;
while (i<25)
{
	if(i%4==0)
	{
		System.out.println();
	}else
	{
		System.out.print(ba3.get(i));
		i++;
	}
		
}*/

//for (int i=0; i<5; i++)
//{
	
	//for (int j=0; j<5; j++)
	//{
