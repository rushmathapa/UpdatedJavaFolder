import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		System.out.println("Enter numbers to multiply");
		Scanner scan = new Scanner(System.in);
		int mulnum = scan.nextInt();
		int i = 0;
		int result = 0;
		while (i <= 10) {
			result = mulnum * i;
			System.out.println("multiple of " + mulnum + " * " + i + " = " + result);
			i +=1;
		}

	}

}
