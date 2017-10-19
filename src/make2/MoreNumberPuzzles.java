package make2;
import java.util.Scanner;

public class MoreNumberPuzzles {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
	
		boolean n=true;
		
		while (n==true)
		{
			System.out.println(" 1) Find two digit numbers <= 56 with sums of digits > 10" );
			System.out.println("2) Find two digit number minus number reversed which equals sum of digits" );
			System.out.println("3) Quit" );
			int choice = keyboard.nextInt();
			
			if (choice==1){
				TwoDigitNrI.TwoDigitNrI();
				System.out.println();	
			}else if (choice==2){
				ReverseNumbers.ReverseNumbers();
				System.out.println();
			}else if (choice == 3){
				System.out.println("TY");
				n=false;
				
			}

	
}
		
	}
}


