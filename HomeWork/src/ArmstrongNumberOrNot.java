import java.util.Scanner;

public class ArmstrongNumberOrNot {

	public static void main(String[] args) {
		System.out.println("Enter any digit to check Armstrong number or not");
		Scanner scan =new Scanner (System.in);
		int remainder = 0;
		int armstrongNumber = 0;
		int digit = scan.nextInt();
		String power = String.valueOf(digit);
		int originalNumber = digit;
		while(digit > 0) {
			remainder = digit % 10;
			remainder = (int) Math.pow(remainder,power.length());
			armstrongNumber = armstrongNumber + remainder;
			digit = digit / 10;
		}
			
			
		if (armstrongNumber == originalNumber) {
			System.out.println("User giver  is ArmstrongNumber");
		}
		else {
			System.out.println("User giver is NOT ArmstrongNumber");
		}
		
		
		

	}

}
