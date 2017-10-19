package make1;

import java.util.Scanner;

public class FunOOObjectDriver {
	
	
		     public static void main( String[] args ) {
		         Scanner keyboard = new Scanner(System.in);
		 
		         // input it
		          System.out.print("Enter a message: ");
		          String msg = keyboard.nextLine();
		
		         FunToObject sfo = new FunToObject();
		         sfo.setMessage(msg);
		         sfo.reverse();
		         sfo.camelCase();
		 
		         // display it
		         System.out.println( sfo.getMessage() );
		     }
		 }


