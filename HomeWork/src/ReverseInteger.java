import java.util.Scanner;

public class ReverseInteger {

	public static void main(String[] args) {
		System.out.println("Enter any number");
		Scanner scan = new Scanner(System.in);
		int numbers = scan.nextInt();
		int reverseint = 0;
		int digit = 0;
		while (numbers > 0) {
			 digit = numbers % 10;
			reverseint = (reverseint * 10) + digit;
			numbers = numbers/10;
		}
		
		System.out.println(reverseint);
		

	}

}
