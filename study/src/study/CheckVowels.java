package study;

import java.util.Scanner;

public class CheckVowels {

	public static void main(String[] args) {
		System.out.println("Enter any Alphabet");
		Scanner scan = new Scanner(System.in);
		char alpha = scan.next().charAt(0);

		if (alpha == 'a' || alpha == 'e' || alpha == 'i' || alpha == 'o' || alpha == 'u') {
			System.out.println("User given Alphabet is Vowel");
		} else {
			System.out.println("User given Alphabet is consonant");
		}

	}

}
