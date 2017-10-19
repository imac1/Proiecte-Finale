package io;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ALittlePuzzleMe {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		File mcool = new File("C:\\Users\\Imac\\Desktop\\puzzle2.txt");
		Scanner webIn = new Scanner( mcool);
		
		String txt = webIn.nextLine();
		
		for (int i=0; i<txt.length(); i++)
		{
			if ((i+1)% 3 == 0)
				System.out.print(txt.charAt(i));
		}
		
		webIn.close();
	}

}
