package study;

import java.util.Scanner;

public class CheckSign {

	public static void main(String[] args) {
		System.out.println("Enter any number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		if (number < 0) {
			System.out.println("The user given number " + number + " is negative ");
		} else if (number > 0) {
			System.out.println("The user given number " + number + " is positive ");
		} else {
			System.out.println("The user given number " + number + " is zero ");
		}
	}

}
