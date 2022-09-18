import java.util.Scanner;

public class SumPrimeComposite {

	public static void main(String[] args) {
		System.out.println("Enter start numbers");
		Scanner scan = new Scanner(System.in);
		int start = scan.nextInt();
		System.out.println("Enter start numbers");
		int end = scan.nextInt();
		int compnum = 0;
		int result = 0;
		while (start <= end) {
			if (start % 2 == 0) {
				compnum = compnum + 1;
				result = compnum + start;
			}
			start = start + 1;
		}
		if (compnum > 2) {
			System.out.println("The sum of composite numbers is " + result);
		} else {
			System.out.println("The sum of prime numbers is " + result);
		}

	}

}
