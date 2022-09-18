import java.util.Arrays;
import java.util.Scanner;

public class CheckAnagramString {

	public static void main(String[] args) {
		System.out.println("Enter any first words");
		Scanner scan = new Scanner(System.in);
		String firstword = scan.nextLine();
		char[]word1 = firstword.toCharArray();//converting string (firstword) to char with format
		System.out.println("Enter second word");
		String secondWord = scan.nextLine();
		char[]word2 = secondWord.toCharArray();
		Arrays.sort(word1);
		Arrays.sort(word2);
		System.out.println(word1);
		System.out.println(word2);
		if(word1.equals(word2)) {
			System.out.println("Yes Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}
		
//		firstword = String.valueOf(word1);
//		secondWord = String.valueOf(word2);
//		
//		
////		if(firstword.equals(secondWord)){
////			System.out.println("It is Anagram");
////			
////		}
////		else {
////			System.out.println("It is not Anagram.Thankyou!!!");
////		}

	}
	

}
