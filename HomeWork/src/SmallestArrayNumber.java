import java.util.Scanner;

public class SmallestArrayNumber {

	public static void main(String[] args) {
		System.out.println("Enter the total numbers of array");
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int[]numbers = new int[count];
		for(int i = 0; i <= numbers.length; i++ ) {
			System.out.println("Enter numbers");
			int num = scan.nextInt();
			numbers[i] = num;
			
			}
		int smallest = numbers[0];
		for(int i = 0; i<= numbers.length; i++) {
			if(smallest > numbers[i]) {
				smallest = numbers[i];
			}
		}
		System.out.println(smallest);
	}

}
