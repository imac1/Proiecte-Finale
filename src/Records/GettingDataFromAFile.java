package Records;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

class Dog 
{
	String breed;
	int age;
	double weight;
}

public class GettingDataFromAFile 
{

	public static void main(String[] args) throws IOException 
	{
		Dog[] dg = new Dog[2];
		int i = 0;
		String dg_b, dg2;
		double dg_w;
		int dg_a;
		
		Scanner kb6 = new Scanner(System.in);
		System.out.println("Which file to open:");
		String file = kb6.next();
		System.out.println("Reading data from " + file);
		
		Scanner newsc = new Scanner(new File(file));

		while (newsc.hasNext()) {
			Dog d = new Dog();
			dg_b = d.breed;
			d.breed = newsc.next();
			dg_a = d.age;
			d.age = newsc.nextInt();
			dg_w = d.weight;
			d.weight = newsc.nextDouble();
			/*dg[i] = new Dog();
			//Dog d2 = new Dog();
			
			 dg[i].breed = newsc.next();
			 dg[i].age = Integer.parseInt(newsc.next());
			 dg[i].weight = Double.parseDouble(newsc.next());
			 i++;
			
			 
			//d1.breed = newsc.nextLine();
			//d1.age = newsc.nextInt();
			//d1.weight = newsc.nextDouble();

			//d2.breed = newsc.nextLine();
			//d2.age = newsc.nextInt();
			//d2.weight = newsc.nextDouble();

			
			//System.out.println("Second dog " + d2.breed + " " + d2.age + " " + d2.weight);
			// System.out.println(newsc.next());

			// dog_db[i] = new Dog();
			// String line = newsc.nextLine();
			// String[] dog_details = line.split(",");

			// dog_db[i].breed = newsc.nextLine();
			// dog_db[i].breed = dog_details[1];

			// i++;
		}


		for (i=0; i<dg.length; i++)
		{
			System.out.println("First dog " + dg[i].breed + " " + dg[i].age + " " + dg[i].weight);
		}

		// Dog d1 = new Dog();
		// d1.breed = fr.readLine();
		// System.out.println(d1.breed);
		// System.out.println( "First dog: " + dog_db[0].breed + ", " );
		// System.out.println( "Second dog: " + dog_db[1].breed); // + ", " +
		// dog_db[1].age + ", " + dog_db[1].weight ); */
			System.out.println(d.breed + " - " + d.age + " - "
					+ " -" + d.weight);
			//System.out.println(dg_b + "" + dg_a + "" + dg_w);
	}
		newsc.close();
		kb6.close();
	}
}
