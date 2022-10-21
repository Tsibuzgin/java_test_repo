package fibonacciNumbers;

import java.util.*;

public class FibonacciNumbers {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		ArrayList<Integer> fibonacciNumbers = new ArrayList<>();
		int i = 0;
		while (true) {
			if (i == 0) fibonacciNumbers.add(1);
			if (i == 1) fibonacciNumbers.add(1);
			if (i >= 2) fibonacciNumbers.add(fibonacciNumbers.get(i - 1) + fibonacciNumbers.get(i - 2));
			String command = in.next();
			if (command.equals("next")) {
				System.out.println(fibonacciNumbers.get(i) + " ");
			} else if (command.equals("stop")) {
				break;
			};
			i++;
		};
	}
}
