package make1;

import java.util.Scanner;

	  class Cow {
		      public void moo() {
		          System.out.println("Cow says moo.");
		      }
		  }
		  
		  class Pig {
		      public void oink() {
		          System.out.println("Pig says oink.");
		     }
		 }
	 

		 
		 public class OldMacDonald {
		     public static void main( String[] args ) {
		    	 Scanner keyboard = new Scanner(System.in);
		 
		         Cow maudine = new Cow();
		         Cow pauline = new Cow();
		         maudine.moo();
		         pauline.moo();
		 
		         Pig snowball = new Pig();
		        snowball.oink();
		         snowball.oink();
		 
		         Duck ferdinand = new Duck();
		         ferdinand.quack();
		         Cow sheery = new Cow();
		         sheery.moo();
		         Pig gigi = new Pig ();
		         gigi.oink();
		     }
		 
	}
		 class Duck {
		     public void quack() {
		         System.out.println(   "Duck says quack.");
		     }
		 }



