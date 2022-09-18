package study;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		System.out.println("Enter the Principal Amount ");
		Scanner scan = new Scanner(System.in);
		float p = scan.nextFloat();
		System.out.println("Enter the Time Frame");
		float t = scan.nextFloat();
		System.out.println("Enter the Rate");
		float r = scan.nextFloat();
		float simpleInterest = (p * t * r) / 100;
		System.out.println("The value of above calculation is " + simpleInterest);

	}

}
