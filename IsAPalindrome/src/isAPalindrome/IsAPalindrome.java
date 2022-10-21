package isAPalindrome;

import java.util.*;

public class IsAPalindrome {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int number = in.nextInt();
		String s = String.valueOf(number);
		int j = 0;
		for (int i = 0; i < s.length()/2; i++) {
			if (!s.substring(i, i + 1).equals(s.substring(s.length() - 1 - i, s.length() - i))) break;
			j++;
		};
		if (j == s.length()/2) System.out.println("Yes"); else System.out.println("No");
	}
}
