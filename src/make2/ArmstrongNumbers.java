package make2;

import java.util.Scanner;

public class ArmstrongNumbers {

	public static void main(String[] args) {
		int cn = 0;
		int sum = 0;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter your number");
		int n = keyboard.nextInt();
		cn = n;
		while (cn != 0) {

			int x = cn % 10;
			x = x*x*x;
			System.out.println(x);
			sum = sum + x;
			cn = cn / 10;

		}
		System.out.println(sum);
		System.out.println(n);
		if (n == sum) {

			System.out.println("the nnumber is an armstrong number");
		}
	}

}
