package study;

import java.util.Scanner;

public class CountDays {

	public static void main(String[] args) {
		System.out.println("Enter a Year ");
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			System.out.println("User given " + year + " Year is 366 days");
		} else {
			System.out.println("User given " + year + " Year is 365 days");

		}
	}
}
