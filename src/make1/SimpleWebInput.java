package make1;
import java.net.URL;
import java.util.Scanner;



		public class SimpleWebInput
		{
			public static void main(String[] args) throws Exception
			{
				URL mcool = new URL("temp.txt");
				Scanner webIn = new Scanner( mcool.openStream() );
			
				String one = webIn.nextLine();
				
				webIn.close();
				
				System.out.println(one);
			}
		}
	
