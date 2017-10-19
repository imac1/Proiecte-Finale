package Arrays;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.Random;


public class BasicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] BasicArray2;
		BasicArray2 = new int[11];
	int i = 0;
	
	
		
for ( i=0; i<BasicArray2.length; i++){
	
	BasicArray2[i] = (int)( Math.random()*10);
	System.out.println( "Slot " + i + " contains a " + BasicArray2[i] );
	
}
	}

}
