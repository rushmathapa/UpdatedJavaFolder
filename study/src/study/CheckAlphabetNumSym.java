package study;

import java.util.Scanner;

public class CheckAlphabetNumSym {

	public static void main(String[] args) {
		System.out.println("Enter the input");
		Scanner scan = new Scanner(System.in);
		char input = scan.next().charAt(0);
		if (input >= 'A' && input <= 'Z' || input >= 'a' && input <= 'z') {
			System.out.println("User given input is Alphabet");
		} else if (input >= 48 && input <= 57) {
			System.out.println("User given input is number ");
		} else {
			System.out.println("User given input is Special Character");
		}
		
		char c = 'a';
		int x = (int)c;
		System.out.println(x);
	}

}
