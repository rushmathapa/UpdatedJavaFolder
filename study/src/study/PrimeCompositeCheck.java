package study;

import java.util.Scanner;

public class PrimeCompositeCheck {

	public static void main(String[] args) {
		System.out.println("Enter any numbers");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		int i = 1;
		int sumc = 0;
		while (i <= number) {
			if (number % i == 0) {
				sumc += 1;
				}
			i += 1;

		}
		if (sumc > 2) {
			System.out.println("Number is Composite");
		} else {
			System.out.println("Number is Prime");
		}
	}

}
