package Arrays;
import java.util.Scanner;
import java.util.Arrays;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;



public class grades {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String firstname = "";
		String familyname = "";
		int[] notes = new int[5];
		int i = 0;
		
		File ettu = new File("C:\\Users\\Imac\\workspace\\make1\\src\\Arrays\\ettu.txt");
        ettu.createNewFile();
       
		Scanner kb = new Scanner(System.in);
		System.out.println("please, enter your name:");
		firstname = kb.nextLine();
		System.out.println("please, enter your family name:");
		familyname = kb.nextLine();
		System.out.println("Name (first last):" + firstname + "\t" + familyname);
		System.out.println("Here are your randomly-selected grades (hope you pass):");
		
		
		
		BufferedWriter outputWriter = null;
		  outputWriter = new BufferedWriter(new FileWriter(ettu));
		  
		  outputWriter.write(firstname);
			
			 outputWriter.write("\t");
			outputWriter.write(familyname);
			System.out.println();

		for (i = 0; i < notes.length; i++) 
		{
			notes[i] = (int) (Math.random() * 100);
			System.out.println("grade: " + i + "\t" + notes[i]);
			
			outputWriter.write(Integer.toString(notes[i]));
		    outputWriter.newLine();
		}
		System.out.println();
		System.out.println("Data saved in " + "ettu.txt");
		 
		  outputWriter.flush();  
		  outputWriter.close();
kb.close();
	}
	 
}
