package IO2;

import java.util.Scanner;
import java.io.File;

public class SummingThreeNumbersFromAFile
{
	public static void main( String[] args ) throws Exception
	{
		int num1, num2, num3;
		File in = new File("3nums.txt");
		in.createNewFile();
		Scanner input = new Scanner(in);
		
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		
		System.out.println( "Reading numbers from file \"3nums.txt\"... done." );
		System.out.println( num1 + " + " + num2 + " + " + num3 + " = " + (num1+num2+num3));
	}
}