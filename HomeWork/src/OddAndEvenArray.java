import java.util.Scanner;

public class OddAndEvenArray {

	public static void main(String[] args) {
		System.out.println("Enter total numbers of array");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] arrayEven = new int[num];
		int evenindex = 0;
		int oddIndex = 0;

		int[] arrayOdd = new int[num];
		int[] array1 = new int[num];
		int index = 0;
		for (int i = 0; i < num; i++) {
			array1[index++] = i;
		}
		for (int i = 0; i < array1.length; i++) {
			if (array1[i] % 2 == 0) {
				arrayEven[evenindex] = array1[i];
				evenindex++;

			} else {
				arrayOdd[oddIndex] = array1[i];
				oddIndex++;

			}
		}
		
		for (int i = 0; i <arrayEven.length ; i++) {
			System.out.println(arrayEven[i]);
		}	System.out.println(arrayOdd[i]);
		
	}

}
