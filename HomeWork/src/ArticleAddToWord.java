import java.util.Scanner;

public class ArticleAddToWord {

	public static void main(String[] args) {
		System.out.println("Enter any words");
		Scanner scan = new Scanner (System.in);
		String word = scan.nextLine();
	
		if(word.charAt(0) == 'a' || word.charAt(0) == 'e' || word.charAt(0) == 'i' || word.charAt(0) == 'o' || word.charAt(0) == 'u') {
			word = "an " + word;
			
		}
		else {
			word = "a " + word;
		}
		System.out.println(word);
		scan.close();
	}

}
