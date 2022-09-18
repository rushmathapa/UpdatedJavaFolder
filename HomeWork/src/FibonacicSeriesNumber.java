import java.util.Scanner;

public class FibonacicSeriesNumber {

	public static void main(String[] args) {
		System.out.println("Enter total numbers of Fibonacisseries");
		Scanner scan = new Scanner(System.in);
		int count = scan.nextInt();
		int first = 0;
		int second = 1;
		int third =0;
		System.out.println(first);
		System.out.println(second);
		
		
		for(int i = 0; i < count-2; i++) {
			 third = first + second;
			 first = second;
			 second = third;
			
			 System.out.println(third);
		}
		
		}
		
	

}
