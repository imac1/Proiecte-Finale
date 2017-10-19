package Arrays;
import java.util.Scanner;
public class parallelArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int con=0;
		int number=0;
		
		String[] lastname = { "Jon", "meri", "Luana", "Amil", "Ana" };
		double[] grade = { 67.5, 99.9, 83.09, 77.89, 88, 34 };
		int[] id = { 333, 456, 698, 856, 742, };
		
		/*for (int i = 0; i<=3; i++)
		{
			System.out.println(lastname[i] + " " + grade[i] + " " +  id[i]);
		}
		*/
		Scanner kb = new Scanner(System.in);
		System.out.println(" enter an id ");
		 number = kb.nextInt();

		for (int i=0; i<id.length; i++)
		{
			if (id[i] == number)
			{
				con =i;
			}
			
		}
		System.out.println(id[con] + " " + lastname[con] + " " + grade[con]);
			}
		}


