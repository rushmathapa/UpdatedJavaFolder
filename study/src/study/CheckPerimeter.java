package study;

import java.util.Scanner;

public class CheckPerimeter {

	public static void main(String[] args) {
		System.out.println("Enter length");
		Scanner scan = new Scanner(System.in);
		float l = scan.nextFloat();
		System.out.println("Enter breadth");
		float b = scan.nextFloat();
		float sr = 2 * (l + b);
		if (l == b) {
			System.out.println("The shape is Sqaure and the perimeter is " + sr);

		} else {
			System.out.println("The shape is rectangle and the perimeter is " + sr);
		}

	}

}
