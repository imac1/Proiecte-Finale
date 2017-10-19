package make2;

import java.util.Scanner;

public class reverseNumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cn = 0;
		int sum = 0;
		int x;
		int j=0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter your number");
		int n = keyboard.nextInt();
		cn = n;
		while (cn != 0) {

			 x = cn % 10;
			j = j*10+x;
			System.out.println(j);
			
			cn = cn / 10;

		}
		

	}

	}


