package study;

import java.util.Scanner;

public class CheckSwap {

	public static void main(String[] args) {
		System.out.println("Enter two numbers ");
		Scanner scan = new Scanner(System.in);
		int v1 = scan.nextInt();
		int v2 = scan.nextInt();
		v1 = v1 + v2;
		v2 = v1 - v2;
		v1 = v1 - v2;

		System.out.println("Swap Numbers are " + v1 + " and " + v2);

	}

}
