package make2;

import java.util.Scanner;

public class BabyCalculator
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);

		double a, b, c = 0;
		String op;

		do
		{
			System.out.print("> ");
			
			a  = keyboard.nextDouble();
			op = keyboard.next();
			
			b  = keyboard.nextDouble();

			if ( op.equals("+") ){
				c = a + b;
				
			}else if (op.equals("-" )) {
				c = a - b;
			}else if (op.equals("*" )){
				c =  a*b;
			}else if (op.equals("/" )){
				c = a/b;
			}else if (op.equals("^")){
				c = power.power(a, b);
			}else if (op.equals("%")){
				c = a%b;
			
			}else if (op.equals("!")){
				c = Factorial.Factorial(a);
				}
			else if (op.equals("sin")){
				c = sin.sin(a);
			}else if (op.equals("cos")){
				c = cos.cos(a);
			}
			
			else
			{
				System.out.println("Undefined operator: '" + op + "'.");
				c = 0;
			}

			System.out.println(c);

		} while ( true );
	}
}