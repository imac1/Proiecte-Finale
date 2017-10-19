package Records;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class IntsFromTxt {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(new File("3nums.txt"));
		int [] tall = new int [100];
		int i = 0;
		while(scanner.hasNextInt())
		{
		     tall[i] = scanner.nextInt();
		}
	}

}
