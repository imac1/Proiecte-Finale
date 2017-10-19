package make1;

import java.util.Scanner;

public class test {

	public static void main(String[] args) {
Scanner keyboard = new Scanner(System.in);



System.out.println("What is your message?");

String message = keyboard.nextLine();

int length = message.length();
int last = message.length()-1;

for (int i= length; i <= message.length(); i++){
	System.out.println( "Here are the characters, one at a time "  );
	System.out.println( i + " - " + message.charAt(0));
	

	for (   i=0; i<message.length(); i++ )
	{
		System.out.println("\t" + i + " - '" + message.charAt(i) + "'");
	}

	int a_count = 0;

	for (   i = 0; i<message.length(); i++ )
	{
		char letter = message.charAt(i);
		if ( letter == 'a' || letter == 'A' )
		{
			a_count++;
		}
	}

	System.out.println("\nYour message contains the letter 'a' " + a_count + " times. Isn't that interesting?");

}
}	
}

