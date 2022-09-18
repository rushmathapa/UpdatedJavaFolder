package study;

import java.util.Scanner;

public class SumLoop {

	public static void main(String[] args) {
		System.out.println("Enter Starting number");
		Scanner scan = new Scanner(System.in);
		int sn = scan.nextInt();
		System.out.println("Enter End number");
		int en = scan.nextInt();
		int sum = 0;
		while (sn <= en) {
			sum += sn;

			sn += 1;
		}
		System.out.println(sum);
	}

}
