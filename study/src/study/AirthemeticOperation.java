package study;

import java.util.Scanner;

public class AirthemeticOperation {

	public static void main(String[] args) {
		System.out.println("Enter the two numbers");
		Scanner scan = new Scanner(System.in);
		float num1 = scan.nextFloat();
		float num2 = scan.nextFloat();
		System.out.println("Enter the Airthemetic Operation");
		char op = scan.next().charAt(0);
		if (op == '+') {
			System.out.println("The sum number " + num1 + "and" + num2 + "is" + (num1 + num2));
		} else if (op == '-') {
			System.out.println("The sum number " + num1 + "and" + num2 + "is" + (num1 - num2));
		} else if (op == '*') {
			System.out.println("The sum number " + num1 + "and" + num2 + "is" + (num1 * num2));
		} else if (op == '/') {
			System.out.println("The sum number " + num1 + "and" + num2 + "is" + (num1 / num2));
		} else if (op == '%') {
			System.out.println("The sum number " + num1 + "and" + num2 + "is" + (num1 % num2));
		}
	}

}
