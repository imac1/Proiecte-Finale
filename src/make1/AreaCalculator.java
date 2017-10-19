package make1;
import java.util.Scanner;

public class AreaCalculator {
	
	public static void main( String[] args )
	{
int n=0;
boolean b=true;

while (b){
	
	Scanner keyboard = new Scanner(System.in);
	
	System.out.println("Shape Area Calculator ");
	System.out.println("1. Triangle");
	System.out.println("2. Rectangle");
	System.out.println( " 3. Square");
	System.out.println("4. Circle");
	System.out.println("5. Quit");
	System.out.println("Which shape"); 

	
	int choice = keyboard.nextInt();
	
	if (choice == 1){
		System.out.println("Enter base");
		int base = keyboard.nextInt();
		System.out.println("Enter heigth");
		int heigth = keyboard.nextInt();
		System.out.println("base "+ base + "heigth " + heigth + area_triangle(base,heigth) );
		 b = true;
	}else if (choice == 2){
		System.out.println("Enter length");
		int length = keyboard.nextInt();
		System.out.println("Enter width");
		int width = keyboard.nextInt();	
		System.out.println( "length " + length + "width "+ width+ area_rectangle(length,width));
		b =true;
	}else if (choice == 3){
		System.out.println("Enter side");
		int side = keyboard.nextInt();
		System.out.println( "side " + side + area_square(side));
		b = true;
	}else if (choice == 4){
		System.out.println("Enter radius");
		int radius = keyboard.nextInt();
		System.out.println( "side " + radius  + area_circle(radius));
		b = true;
	} else if (choice == 5){
		System.out.println(" Thank you, goodbye");
		b=false;
		System.out.println("game over");
	}
	
}
		
	}
		

		// put a function call for weekday() here
	

	public static double area_circle( int radius )  {
		int result;
		 result  = (int) (radius * radius * Math.PI);
		return result;
	}
	public static int area_rectangle( int length, int width ){
		int result;
		result = (int) length*width;
		return result;
		
	}
	public static int area_square( int side )   {
		int result;
		result = (int) side*side;
		return result;
		
	}
	public static double area_triangle( int base, int height ){
		int result;
		result = (int) base*height;
		return result;
		
	}
}

