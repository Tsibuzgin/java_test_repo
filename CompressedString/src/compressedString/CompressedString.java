package compressedString;

import java.util.*;

public class CompressedString {
	public static String MyMethod(String str) {
	int i = 0;
	int j = 1;
	int c = 0;
	String encoded = "";
	while (true) {
		if (str.length() == 0) {
			encoded = "";
			break;
		} else {
			if (i+2 != str.length()) {
				char x = str.charAt(i);
				char y = str.charAt(i+1);
				if (x == y) {
					j++;
					i++;
				} else if (c == 0) {
						encoded = j + str.substring(i, i+1);
						i++;
						c++;
						j = 1;
					} else {
						encoded = encoded + j + str.substring(i, i+1);
						i++;
						j = 1;
					}
			} else {
				char x = str.charAt(i);
				char y = str.charAt(i+1);
				if (x == y) {
					if (c == 0) {
						j++;
						encoded = j + str.substring(i, i+1);
					} else {
						j++;
						encoded = encoded + j + str.substring(i, i+1);
					};
					break;
				} else {if (c == 0) {
						encoded = j + str.substring(i, i+1) + 1 + str.substring(i+1, i+2);
						j = 1;
					} else {
						encoded = encoded + j + str.substring(i, i+1) + 1 + str.substring(i+1, i+2);
						j = 1;
					}
				break;
				}
			}
		}
		}
	str = encoded;
		return str;
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println(MyMethod(in.next()));
	}
}

