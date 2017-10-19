package Arrays;
import java.util.Random;
import java.util.Arrays;
import java.util.ArrayList; 
import java.util.Collections;

public class ArrCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//* You can copy an array in a couple of ways
        // Arrays.copyOf(arrayToCopy, numberToCopyFromBeginning);
        
        //int[] numberCopy = Arrays.copyOf(numberArray, 5);
        //for(int num : numberCopy)
        //{
        //    System.out.print(num);
       // }
        //System.out.println("\n");
         
        // You can copy an array from one index to another with copyOfRange
        // int[] numberCopy = Arrays.copyOf(numberArray, 1, 5);
         
        // You can print out the whole array with toString
        //System.out.println(Arrays.toString(numberCopy));


		
		int [] arr = new int  [10];
		int i;
		int [] copy = new int [10];
		
		for ( i=0; i<arr.length; i++)
		{
			
		    arr[i ]= (int)(Math.random()*100);
			System.out.print( arr[i] + " " );
			
		}
		System.out.println();
		
		 copy = Arrays.copyOf(arr, 5);
		 for (int num:copy )
				 System.out.print( num + "  ");
			 
		arr[arr.length-1] =-7;
		System.out.println();
		
		System.out.print("arr2: ");
		for (i=0;i<arr.length;i++)
			System.out.print(arr[i] + " " );
			
			}
		}
	
