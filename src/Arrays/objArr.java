package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class objArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		char [] a = {'a', 'n','a'};
		String [] b = {"ana", " red", "bebe"};
		String c = "ana";
		char [] d = new char [10];		
		
		
		Arrays.sort(a);
		Arrays.sort(b);
		System.out.println(a);
		System.out.println(b);
		d= c.toCharArray();
		System.out.println(d);
	}

}
