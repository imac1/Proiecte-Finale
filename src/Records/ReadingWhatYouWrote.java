package Records;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class Car1
{
	String make;
	String model;
	int year;
	String plate;
}

public class ReadingWhatYouWrote {

	public static void main(String[] args) throws IOException {
		Car1 c1[] = new Car1[5];
		int i=0;
		
		Scanner k2 = new Scanner(System.in);

		System.out.println("Which file to open:");
		String file = k2.next();

		System.out.println("Reading data from " + file);
		Scanner s2 = new Scanner(new File(file));
		
		while (s2.hasNext())
		{
			
			c1[i] = new Car1();
			c1[i].make = s2.next();
			c1[i].model = s2.next();
			c1[i].year = s2.nextInt();
			c1[i].plate = s2.next();
			i++;
			
		}
		for (i=0; i<c1.length; i++)
		{

			System.out.println( "Car " + (i + 1) );
			System.out.println( "\tMake: " + c1[i].make );
			System.out.println( "\tModel: " + c1[i].model );
			System.out.println( "\tYear: " + c1[i].year );
			System.out.println( "\tLicense: " + c1[i].plate );
		}

	}

}
