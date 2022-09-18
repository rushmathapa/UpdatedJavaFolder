package study;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		System.out.println("Enter the Year to check whether it is Leap or not");
		Scanner sc = new Scanner(System.in);
		int Year = sc.nextInt();
		if (Year % 400 == 0) {
			System.out.println(+Year + " is  Leap year ");
		}

		else if (Year % 4 == 0 && Year % 100 != 0) {
			System.out.println(+Year + " is Leap year ");
		}

		else {
			System.out.println(+Year + " is not Leap year ");
		}

	}

}
