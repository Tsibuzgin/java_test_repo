package bubbleSortArrayList;

import java.util.*;

public class BubbleSortArrayList {
	public static void main(String[] args) {
		System.out.println("How many elements are in array?");
		Scanner in = new Scanner(System.in);
		int amount = in.nextInt();
		ArrayList<Integer> array = new ArrayList<Integer> ();
		for (int i = 0; i < amount; i++) {
			array.add(in.nextInt());
		};
		for (int i = 0; i < amount - 1; i++) {
			for (int j = 0; j < amount - 1 - i; j++) {
				if (array.get(j) > array.get(j+1)) {
					int b = array.get(j);
					array.set(j, array.get(j+1));
					array.set(j+1, b);
				};
			};
		};
		for (int i = 0; i <= amount - 1; i++) {
			System.out.println(array.get(i));
		};
	}
}
