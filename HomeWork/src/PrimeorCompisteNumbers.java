import java.util.Scanner;

public class PrimeorCompisteNumbers {
public static void main(String[]args) {
	System.out.println("Enter any Number");
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	int i = 1;
	int result = 0;
	while(i<=num) {
		if(num % i == 0) {
			 result = result + 1 ;
		}
		i = i + 1;
	}
	if (result > 2) {
		System.out.println("Number is composite");
	}
	else {
		System.out.println("Numbers is Prime");
	}
}
}
