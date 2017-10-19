package make2;
import java.util.Scanner;

public class DisplayingSomeMultiples {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("please, enter a number");
		int  number = keyboard.nextInt();
 for (int i = 1; i <= 12; i++ ){
	 
	 System.out.println(number + "x" + i + "=" + number*i);
	 
 }
	}

}
