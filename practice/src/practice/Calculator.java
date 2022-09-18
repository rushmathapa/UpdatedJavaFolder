package practice;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.println("Enter the first float number");
		Scanner scan = new Scanner(System.in);
		float num1 = scan.nextFloat();
		System.out.println("Enter the second float number");
		float num2 = scan.nextFloat();
		
		float add = num1 + num2;
		float sub = num1 - num2;
		float prod = num1 * num2;
		float div  = num1 / num2;
		float rem  = num1 % num2;	
		
		System.out.println("The Sum of two floating number is " + add );
		System.out.println("The Subtraction of two flaoting number is " + sub);
		System.out.println("The Production of two flaoting number is " + prod);
		System.out.println("The Division of two flaoting number is " + div);
		System.out.println("The remainder of two flaoting number is " + rem);
		
		
			
		
		
		

	}

}
