package Records;
import java.util.Scanner;

class Student
{
	String name;
	int grade;
	double  average;	
}

public class BasicRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner kb = new Scanner(System.in);
		
		Student s1 =  new Student();
		Student s2 = new Student();
		Student s3 =  new Student();
		
		System.out.println(" Enter the first student's name:");
		s1.name = kb.next();
		System.out.println(" Enter the first student's grade:");
		s1.grade = kb.nextInt();
		System.out.println(" Enter the first student's average:");
		s1.average = kb.nextDouble();
		
		System.out.println(" Enter the second student's name: ");
		s2.name = kb.next();
		System.out.println(" Enter the second student's grade:" );
		s2.grade = kb.nextInt();
		System.out.println(" Enter the second student's average: ");
		s2.average = kb.nextDouble();
		
		System.out.println(" Enter the third student's name:" );
		s3.name = kb.next();
		System.out.println(" Enter the third student's grade: ");
		s3.grade = kb.nextInt();
		System.out.println(" Enter the third student's average:");
		s3.average = kb.nextDouble();
		
		System.out.println(" The names are:" + s1.name + ", " + s2.name + " " + s3.name);
		System.out.println( " The grades are: " + s1.grade + " , " + s2.grade + " ," + s3.grade);
		System.out.println( " The averages are: " + s1.average + " ," + s2.average + " ," + s3.average);
		
		System.out.println( " The average for the three students is: " + (s1.average + s2.average + s3.average) / 3 );
		kb.close();
	}
	

}
