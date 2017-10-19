package Records;
import java.util.Scanner;

class Name
{
	String surname;
	String mainname;
}

class Student
{
	Name e;
	int grade;
	double  average;	
}

public class ALittleDatabase {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
	
		
		Student[] s_db = new Student[3];
		s_db[0] = new Student();
		
		System.out.println(" Enter the first student's name:");
		s_db[0].e.surname = kb.next();
		System.out.println(" Enter the first student's grade:");
		s_db[0].grade = kb.nextInt();
		System.out.println(" Enter the first student's average:");
		s_db[0].average = kb.nextDouble();
		
		
		s_db[1] = new Student();
		
		System.out.println(" Enter the second student's name: ");
		s_db[1].e.surname= kb.next();
		System.out.println(" Enter the second student's grade:" );
		s_db[1].grade =  kb.nextInt();
		System.out.println(" Enter the second student's average: ");
		s_db[1].average= kb.nextDouble();
	
		s_db[2] = new Student();
		
		System.out.println(" Enter the third student's name:" );
		s_db[2].e.surname = kb.next();
		System.out.println(" Enter the third student's grade: ");
		s_db[2].grade = kb.nextInt();
		System.out.println(" Enter the third student's average:");
		s_db[2].average = kb.nextDouble();
		
		
		System.out.println(" The names are:" + s_db[0].e.surname + ", " + s_db[1].e.mainname+ " " + s_db[2].e.surname);
		System.out.println( " The grades are: " + s_db[1].grade + ", " + s_db[1].grade+ " " + s_db[1].grade);
		System.out.println( " The averages are: " + s_db[0].average + ", " + s_db[1].average + " " + s_db[2].average);
		
		System.out.println( " The average for the three students is: " + (s_db[0].average + s_db[1].average + s_db[2].average) / 3 );
		kb.close();
	}

}
