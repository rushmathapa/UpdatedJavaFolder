import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter any String");
		Scanner scan = new Scanner(System.in);
		String value = scan.nextLine();
		String reverse = "";

		for (int i = value.length() - 1; i >= 0; i--) {
			reverse = reverse + value.charAt(i);
		}
		if (reverse.equals(value)) {
			System.out.println("The given String is Palindrom");
			
		}
		else {
			System.out.printf("%s  is NOT Palindrom \n" , value);
		}

		System.out.println(reverse);
	}

}
