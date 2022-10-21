package changeTheOrderOfElementsInARow;

import java.util.*;

public class ChangeTheOrderOfElementsInARow {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		//reading original string
		String row = in.nextLine();
		//declaring reversed string
		String reversed_row = "";
		//filling reversed string
		for (int i = 0; i < row.length(); i++) {
			reversed_row += row.substring(row.length() - 1 - i, row.length() - i);
		}
		System.out.println(reversed_row);
	}
}
