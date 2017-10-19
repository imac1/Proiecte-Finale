package Records;

import java.io.File;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class Person {
	String name;
	int age;
}

public class GettingMoreDatafromaFile {

	public static void main(String[] args) throws IOException {
		int i=0;
		Person parr[] = new Person[5];

		Scanner kb8 = new Scanner(System.in);
		System.out.println("Which file to open:");
		String file = kb8.next();
		System.out.println("Reading data from " + file);
		Scanner sc = new Scanner(new File(file));
		
		while (sc.hasNext()) 
		{
			parr[i] = new Person();
			parr[i].name = sc.next();
			parr[i].age = sc.nextInt();
			i++;
			
			}
		
		for ( i = 0; i < parr.length; i++) {
			
			System.out.println( parr[i].name + "is " + parr[i].age);
			
			kb8.close();
			sc.close();
		}
	
	}

}

/*
 * File person = new File("person.txt"); person.createNewFile(); 
 * PrintWriter fileout;
 * 
 * fileout = new PrintWriter(new FileWriter("person.txt"));
 * 
 * fileout.println("ana 5"); fileout.println("bna 56");
 * fileout.println("fog 3"); fileout.println("red 2"); fileout.println("blu 1");
 * fileout.close();
 */