package ArrayLists;

import java.util.ArrayList;
import java.util.Random;

public class CopyingArrayLists {

	public static void main(String[] args) {

		ArrayList<Integer> a1 = new ArrayList<>(10);
		ArrayList<Integer> a2 = new ArrayList<>(10);
		ArrayList<Integer> a3 = new ArrayList<>(10);
		Random r1 = new Random();

		for (int i = 0; i < 10; i++) {
			a1.add(r1.nextInt(100));
			a2.add(r1.nextInt(100));
		}

		a1.add(10, -7);

		ArrayList<Integer> clone2 = (ArrayList<Integer>) a1.clone();
		ArrayList<Integer> clone = clone2;
		a3 = clone;

		System.out.println(a1);

		System.out.println(a2);

		System.out.println(a3);
	}

}
