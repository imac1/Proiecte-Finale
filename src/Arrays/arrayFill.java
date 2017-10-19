package Arrays;

import java.util.Arrays;

public class arrayFill {

	public static void main(String[] args) {
		
		float StudentIds [] = new float [100];
		
		Arrays.fill((StudentIds), 1);
		for (int i =0; i<StudentIds.length; i++)
		{
			System.out.println(StudentIds[i]);
		}
		Arrays.fill((StudentIds), 2, 30, 0);
			
			for ( int i=0; i<StudentIds.length; i++)
			{
				System.out.println(StudentIds[i]);
			}
		}
}
