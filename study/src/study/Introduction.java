package study;

import java.util.Scanner;

public class Introduction {
	public static void main(String[] args) {
		System.out.println("Enter your First Name and Last name");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println("Enter your city");
		String city = scan.nextLine();
		System.out.println("My name is " + name + " I live in" + city);
		System.out.println("What is your Hobby");
		String Hobby = scan.nextLine();
		System.out.println("My hobbies are to " + Hobby);
		System.out.println("What do you do for living?");
		String Living = scan.nextLine();
		System.out.println("I am a " + Living + "Gracias !!!");

	}
}
