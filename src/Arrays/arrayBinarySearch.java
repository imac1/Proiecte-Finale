package Arrays;
import java.util.Arrays;

public class arrayBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] id = { 333, 456, 698, 856, 742, 235,135,566,56,78};
		int index=0;
	
		
	 Arrays.sort(id);
		for ( int i=0; i<id.length; i++)
		{
			
			System.out.print(id[i] + " ");
		}
		System.out.println();
		index = Arrays.binarySearch(id, 78);
		System.out.println("78 is an element on position " + index);
	}

}
