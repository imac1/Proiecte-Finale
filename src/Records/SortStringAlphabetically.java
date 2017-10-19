package Records;

public class SortStringAlphabetically {

	public static void main(String[] args) {
		
		/* result = Word1.compareTo( Word2 );

The compareTo method returns a value.
 If Word1 comes before Word2, then the value that is returned will be less than 0. 
 If Word1 comes after Word2 then the value returned will be greater than 0. 
If the two words are identical then a value of 0 will be returned. */
		
		 String[] a = { "ana", "xan", "bob", "cat", "mum" };
		 int result; 
		 for (int i=0; i<a.length; i++)
		 {
			 for (int j=0; j<a.length; j++)
			 {
				  result = a[i].compareTo(a[j]);
				  if (result < -1)
				  {
				  	System.out.println(a[i] );
				  }
				 /* else if (result==0)
				  {
					  System.out.println(a[i]);
				  }
				  else if(result>0)
				  {
					  System.out.println(a[j]);
				  } */
				  
			 }
		 }

	}

}
