package study;

import java.util.Scanner;

public class GreatestValue {

	public static void main(String[] args) {
		System.out.println("Enter First Number");
		Scanner scan = new Scanner(System.in);
		int n1 = scan.nextInt();
		System.out.println("Enter Second Number");
		int n2 = scan.nextInt();
		System.out.println("Enter Third Number");
		int n3 = scan.nextInt();
		int greatest = n1;
		if (n1 > n2 && n1 > n3) {
			greatest = n1;
		} else if (n2 > n1 && n2 > n3) {
			greatest = n2;
		} else {
			greatest = n3;
		}
		System.out.println("The greatest number is " + greatest);
	}
}
