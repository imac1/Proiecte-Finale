package make2;
import java.util.Scanner;

public class ArmstrongForLoop {

	public static void main(String[] args) {
		
		int num1, temp, sum = 0, rem;

		Scanner keyboard = new Scanner(System.in);
		System.out.println("enter your number");
		
		num1 = keyboard.nextInt();
	    for(temp = num1; num1 != 0;)
	    {
	        rem = num1%10;
	        sum = sum + (rem*rem*rem);
	        num1 = num1/10;
	    }
	    if(sum == temp)
	    {
	        System.out.println(temp+" is an Armstrong Number\n" );
	    }
	    else
	    {
	    	System.out.println(temp+ " is not an Armstrong Number\n" );
	    	
	    }
	   
	}
	

	}

