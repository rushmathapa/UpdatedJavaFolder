package study;

import java.util.Scanner;

public class CompundInterest {

	public static void main(String[] args) {
		System.out.println("Enter the Principal Amount ");
		Scanner scan = new Scanner(System.in);
		double p = scan.nextDouble();
		System.out.println("Enter the interest rate ");
		double r = scan.nextDouble();
		System.out.println("Enter the Time Frame");
		double t = scan.nextDouble();
		System.out.println("Enter number of times interest");
		double n = scan.nextDouble();

		double ca, ci;
		ca = p * (1 + r / 100) ^ n / t;
		ci = ca - p;

	}

}
