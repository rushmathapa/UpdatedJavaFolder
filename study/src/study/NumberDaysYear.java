package study;

import java.util.Scanner;

public class NumberDaysYear {

	public static void main(String[] args) {
		System.out.println("Enter the days");
		Scanner scan = new Scanner(System.in);
		int days = scan.nextInt();
		int week, year;
		year = days / 365;
		week = (days % 365) / 7;
		days = (days % 365) % 7;
		System.out.println(+days + "converted into " + year + "and" + week + "and " + days);
	}

}
