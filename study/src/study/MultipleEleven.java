package study;

import java.util.Scanner;

public class MultipleEleven {

	public static void main(String[] args) {
		System.out.println("Enter numbers ");
		Scanner scan = new Scanner(System.in);

		int num = 1;
		while (num <= 100) {
			if (num % 11 == 0) {
				System.out.println("The multiple of 11 are " + num);

			}
			num += 1;
		}

	}

}