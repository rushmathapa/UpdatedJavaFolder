package practice;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		System.out.println("Enter your name ");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println("Enter your city ");
		String city = scan.nextLine();
		System.out.println(" My name is " + name +" I live in " + city );
		
		System.out.println(" Enter the first numbers ");
		//Scanner scan = new Scanner(System.in);
		int num1 = scan.nextInt();
		System.out.println(" Enter second number ");
		int num2 = scan.nextInt();
		
		  int add = num1 + num2;
		  int sub = num1 - num2;
		  int prod = num1 * num2;
		  int div = num1/ num2;
		  System.out.println(add);
		  System.out.println(sub);
		  System.out.println(prod);
		  System.out.println(div);
		  
		
		
		
	}

}
