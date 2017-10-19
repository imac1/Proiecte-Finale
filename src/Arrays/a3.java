package Arrays;
import java.util.Arrays;
import java.util.Random;


public class a3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i=0; // row
		int j=0;// column
	
		String  [] [] array3 = new String [100][10];
		
		
		for (i=0; i<array3.length; i++){
			i = (int) (Math.random()*100);
			j = (int)(Math.random()*100);
			
			for (j=0; j < array3[i].length; j++){
		
				array3[i][j]= i  + " " + j;
				System.out.print(array3[i][j] +"\t");
			}
			
			
			System.out.println();
		}
		
		
		
		
		
	}

}
