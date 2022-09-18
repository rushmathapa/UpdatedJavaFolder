package study;

import java.util.Scanner;

public class MonthDays {

	public static void main(String[] args) {
		System.out.println("Enter the choice");
		Scanner scan = new Scanner(System.in);
		int month = scan.nextInt();
		// int days = scan.nextInt();

		switch (month) {
		case 1:
			System.out.println("January month = 31 days ");

			break;
		case 2:
			System.out.println("February month");

			break;
		case 3:
			System.out.println("March month");

			break;
		case 4:
			System.out.println("April month");

			break;
		case 5:
			System.out.println("May month");

			break;
		case 6:
			System.out.println("June month");

			break;
		case 7:
			System.out.println("July month");

			break;
		case 8:
			System.out.println("August month");

			break;
		case 9:
			System.out.println("September month");

			break;
		case 10:
			System.out.println("October month");

			break;
		case 11:
			System.out.println("November month");

			break;
		case 12:
			System.out.println("December month");

			break;
		default:
			System.out.println("invalid number ");

		}

	}

}
