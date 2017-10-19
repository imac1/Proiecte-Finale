package Records;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

class Dog3
{
	String name;
	int age;
	double weight;	
}


public class gdfaf {

	public static void main(String[] args) throws IOException {
 Dog3 d1 = new Dog3();
 Dog3 d2 = new Dog3();

 Scanner k = new Scanner(System.in);
	System.out.println("Which file to open:");
	String file = k.next();
	System.out.println("Reading data from " + file);
	Scanner sc = new Scanner(new File(file));
	
	while (sc.hasNext())
	{
		String newdn1 = d1.name;
		d1.name = sc.next();
		int newda1 = d1.age;
		d1.age = sc.nextInt();
		double newdw1 = d1.weight;
		d1.weight = sc.nextDouble();
		
		String newdn2 = d2.name;
		d2.name = sc.next();
		int newda2 = d2.age;
		d2.age = sc.nextInt();
		double newdw2 = d2.weight;
		d2.weight = sc.nextDouble();
	}
		
		System.out.println(d1.name + " " + d1.age + " " + d1.weight);
		System.out.println(d2.name + " " + d2.age + " " + d2.weight);
		sc.close();
		k.close();

	}

}

/*PrintWriter p = new PrintWriter (new FileWriter("dog3.txt"));
p.println("molo 3 4.6");
p.println("jolo 4 5.6");
p.close();*/
