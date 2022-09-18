import java.util.Scanner;

public class DisplayAllFactorsNumbers {
	public static void main(String[] args) {
		System.out.println("Enter any Numbers");
		Scanner scan = new Scanner(System.in);
		int factorsnum = scan.nextInt();
		int i = 1;
		while (i <= factorsnum) {
			if (factorsnum % i == 0) {
				int factors = i;
				System.out.println(factors);
			}
			i = i + 1;
		}

	}
}
