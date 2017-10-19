package Arrays;

public class givingAnArrayABunchOfValuesAtOnce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] arr1 = { "alpha", "bravo", "charlie", "delta", "echo" };
		int [] arr2 = {11, 23, 37, 41, 53};

		System.out.print("The first array is filled with the following values:\n\t");
		
		for ( int i=0; i<arr1.length; i++ )
		{
			
			System.out.print( arr1[i] + " " );
		}
		System.out.println();
		
		for (int j=0; j<arr2.length; j++)
			
		{
			System.out.print( arr2[j]+ " " + "\t");
		}
		System.out.println();
	}

}
