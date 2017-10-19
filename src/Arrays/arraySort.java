package Arrays;
import java.lang.reflect.Array;
import java.util.Arrays;

public class arraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] lastname = { "Jon", "meri", "Luana", "Amil", "Ana" }; 
		
		Arrays.sort(lastname);
		for (int i=0; i<lastname.length; i++){
			System.out.println(lastname[i]);
		}
		
	}

}
