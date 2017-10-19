package Arrays;

public class arrayD1 {

	public static void main(String[] args) {
		
		String[] namelist;
		int[] A;
		int [] prices;
		
		
		namelist = new String[1000];
		A = new int[5];
		prices = new int [100];
		
		int [] list;
		list = new int [5];
		list[1] = 3;
		list[2] = 4;
		int i;  // the array index
		for (i = 0; i < list.length; i++) {
		    System.out.println( list[i] );
		}
		
		
		System.out.println(A.length);
		System.out.println(namelist);
		System.out.println(prices);

	}

}
