package Records;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class Student1 {
	int id;
	int grade;
	float gradenr;
	String lettergr;
}

public class SortingRecordsonTwoFields {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int i = 0;
		Student1[] st = new Student1[30];

		Scanner k5 = new Scanner(System.in);

		System.out.println("Which file to open:");
		String file = k5.next();

		System.out.println("Reading data from " + file);
		Scanner s4 = new Scanner(new File(file));
		
		while (s4.hasNext()) {
			
				st[i] = new Student1();
				st[i].id = s4.nextInt();
				st[i].grade = s4.nextInt();
				st[i].gradenr = s4.nextFloat();
				st[i].lettergr = s4.next();
				i++;
			}
	
		System.out.println();
        System.out.println("before sorting");
		
	for (i = 0; i < st.length; i++) 
	{
		System.out.println(st[i].id + " " + st[i].grade + " " + st[i].gradenr  + " " + st[i].lettergr );
	}
	
	for (i=0; i<st.length; i++)
	{
		for (int j=0; j<st.length; j++)
		{
			if (st[i].id < st[j].id)
			{
				int a = st[i].id;
				st[i].id = st[j].id;
				st[j].id =  a;
			}
	
		}
	}
	System.out.println();
    System.out.println("after sorting");
    for (i=0; i<st.length; i++)
    System.out.println(st[i].id + " " + st[i].grade + " " + st[i].gradenr  + " " + st[i].lettergr );
    
    s4.close();
    k5.close();
	}
}



/*for (i=0; i<st.length; i++)
{
for ( j=0; j<st.length; j++)
{
	if ((st[i].id == st[j].id) && (st[i].grade<st[j].grade))
	{
		int a = st[i].grade;
		st[i].grade = st[j].grade;
		st[j].grade =  a;
	}
	
}
}
*/