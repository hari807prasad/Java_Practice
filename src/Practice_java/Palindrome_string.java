package Practice_java;

import java.util.Scanner;

public class Palindrome_string {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		System.out.println("Please Enter a Number");
		String str = scr.next();
		String org_str = str;
		String rev = " ";
		int leng = str.length();

		for (int i = leng - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}
		if (org_str.equals(rev)) {
			System.out.println(org_str + " Is a palindrome String ");
		} else {
			System.out.println(org_str + " Is not a palindrome String ");
		}
	}
}