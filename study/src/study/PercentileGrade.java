package study;

import java.util.Scanner;

public class PercentileGrade {

	public static void main(String[] args) {
		System.out.println("Enter the Percentage ");
		Scanner scan = new Scanner(System.in);
		float percentile = scan.nextFloat();
		if (percentile <= 70) {
			System.out.println("The above given percentile " + percentile + "is D");
		} else if (percentile > 70 && percentile <= 80) {
			System.out.println("The above given percentile " + percentile + "is C");
		} else if (percentile > 80 && percentile <= 90) {
			System.out.println("The above given percentile " + percentile + "is B");
		} else {
			System.out.println("The above given percentile " + percentile + "is A");
		}

	}

}
