import java.util.Scanner;

public class CountWordInSentence {

	public static void main(String[] args) {
		System.out.println("Enter any user sentence");
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		int count = 0;
		count = word.split(" ").length;
		System.out.println("The total number of value in array are " +count);
		

	} 
}
