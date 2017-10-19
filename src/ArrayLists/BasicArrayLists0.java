package ArrayLists;
import java.util.ArrayList;

public class BasicArrayLists0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList <Integer> ba = new ArrayList<Integer>(10);
		ba.add(-113);
		ba.add(-113);
		ba.add(-113);
		ba.add(-113);
		ba.add(-113);
		ba.add(-113);
		
		System.out.println("slot 0 contains " + ba.get(0));
		System.out.println("slot 1 contains " + ba.get(1));
		System.out.println("slot 2 contains " + ba.get(2));
		System.out.println("slot 3 contains " + ba.get(3));
		
	}

}
/*for (Integer number:ba)
{
	System.out.print(number + " ,");
}*/