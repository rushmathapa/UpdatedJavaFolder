package study;

import java.util.Scanner;

public class CheckMultiple {

	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if (num % 7 == 0 && num % 5 == 0) {
			System.out.println("User given number" + num + "is multiple of both 7 & 5 ");

		} else {
			System.out.println("User given number" + num + "is not multiple of 7 & 35");

		}

		System.out.println("Enter First number ");
		int num1 = sc.nextInt();
		System.out.println("Enter Second number");
		int num2 = sc.nextInt();
		if (num1 > num2) {
			System.out.println("The greatest nember is " + num1);
		} else {
			System.out.println("The smallest number is " + num2);
		}

	}

}