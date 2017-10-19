package Records;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class Car
{
	String make;
	String model;
	int year;
	String plate;
}

public class StoringDatainFile {

	public static void main(String[] args) throws IOException {
		Car c[] = new Car[5];
		int i=0;
		
		Scanner k1 = new Scanner(System.in);

		System.out.println("Which file to open:");
		String file = k1.next();

		System.out.println("Reading data from " + file);
		Scanner s1 = new Scanner(new File(file));
		
		while (s1.hasNext())
		{
			
				c[i] = new Car();
				c[i].make = s1.next();
				c[i].model = s1.next();
				c[i].year = s1.nextInt();
				c[i].plate = s1.next();
				i++;
						
			
		}
		
		for ( i=0; i<c.length; i++)
		{
			System.out.println("car " + (i+1) + " " + c[i].make + " " + c[i].model + " " + c[i].year + " " + c[i].plate);
		}
		
k1.close();
s1.close();
	}

}

/*File cars = new File ("cars.txt");
cars.createNewFile();
PrintWriter f = new PrintWriter (new FileWriter ("cars.txt"));
f.println("Toyota Camry 1985 622-VRX");
f.println("Chevrolet Chevette 1980 J43-SMB");
f.println("Honda Civic 1993 883-RS9");
f.println("Ford Mustang 1966 AZUCAR");
f.println("Dodge Neon 1996 G74-LLC");
f.close();*/