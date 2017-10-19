package ArrayLists;

import java.util.Random;

import java.util.ArrayList;

public class BasicArrayLists2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> ba2 = new ArrayList<>(10);

		Random r = new Random();

		for (int i = 0; i < 10; i++) {
			ba2.add(r.nextInt(100));
		}
		System.out.println("lista contine " + ba2);
	}

}
