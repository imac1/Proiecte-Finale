package make2;

import java.util.Scanner;



public class ForLoopsRevisited {
	
	public static void main( String[] args ) {
	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("please, enter your name");
		String name = keyboard.nextLine();
		
		if (name.equals("mitch")){
			for ( int i =0; i<5; i++){
				System.out.println(i + "" +  name);
			}
			
		}else for (int i =0; i <10; i++){
			System.out.println(i + "" + name);

	}
	
	}
}
