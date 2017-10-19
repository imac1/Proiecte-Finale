package Records;

import java.util.Scanner;

class Student2
{
	String name;
	int grade;
	double  average;	
}

public class ALittleDatabaseLoop {

	public static void main(String[] args) {
		int i=0;
		
		Scanner kb5 = new Scanner(System.in);
		Student2 [] sdb =  new Student2[3];
		
		
		for ( i=0; i<sdb.length; i++)	
		{
			sdb[i] = new Student2();	
			
			System.out.println("enter s's name ");
			sdb[i].name =  kb5.next();
			System.out.println("enter ss grade");
			sdb[i].grade = kb5.nextInt();
			System.out.println("enter ss average");
			sdb[i].average = kb5.nextDouble();	
		}
		
		for (i=0; i<sdb.length; i++)
		{
			System.out.println("ss names are " + sdb[i].name);
		}
		System.out.println();	
		
		for (i=0; i<sdb.length; i++)
		{
			System.out.println(" ss grades are " + sdb[i].grade);
		}
		System.out.println();	
		
		for (i=0; i<sdb.length; i++)
		{
			System.out.println("ss averages are " + sdb[i].average);
		}
		System.out.println();	
		
		System.out.println("the averages sum is " + (sdb[0].average + sdb[1].average + sdb[2].average) /3);
		kb5.close();
	}
	

}
