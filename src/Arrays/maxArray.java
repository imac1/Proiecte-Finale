package Arrays;

public class maxArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] notes = new int[10];
		int i ;
		int max;
		int constanta=0;
		
		
		 for (i = 0; i < notes.length; i++) 
		 {
			  notes[i] = (int) (Math.random() * (-50));
			  System.out.print(notes[i] + " " );
		 }
		 max=notes[0];
		 
		  for (i = 1; i < notes.length; i++) 
		  {
			if (notes[i] > max)
			{ max=notes[i];
			     constanta=i;
			}
		  }
		  System.out.println();
		  System.out.println( " The largest value is " + max + " on position " + constanta);
}

	}

}
