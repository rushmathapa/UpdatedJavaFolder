package study;

import java.util.Scanner;

public class StartEndloop {

	public static void main(String[] args) {
		System.out.println("Enter Start number");
		Scanner scan = new Scanner(System.in);
		int sn = scan.nextInt();
		System.out.println("Enter End number");
		int en = scan.nextInt();
		while (sn <= en) {
			if (sn % 7 == 0 && sn % 5 == 0) {
				System.out.println("Multiple of 7 & 5 are listed below:" + sn);
			}
			sn += 1;
		}
	}

}
