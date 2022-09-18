import java.util.Scanner;

public class ArraySumAverageNumbers {

	public static void main(String[] args) {
		System.out.println("Enter total numbers ");
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int sum = 0;
		int numbers[] = new int[count];
		for (int i = 0; i < numbers.length; i++) {
			System.out.println("Enter any number");
			int firstnum = scan.nextInt();
			numbers[i] = firstnum;
		}

		for (int i = 0; i < numbers.length; i++) {
			sum = sum + numbers[i];

		}
		System.out.println(sum);

		float average = sum / count;
		System.out.println(average);

	}

}
