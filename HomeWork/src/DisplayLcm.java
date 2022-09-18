import java.util.Scanner;

public class DisplayLcm {

	public static void main(String[] args) {
		System.out.println("Enter any first numbers");
		Scanner scan = new Scanner(System.in);
		int firstnum = scan.nextInt();
		System.out.println("Enter any second numbers");
		int secnum = scan.nextInt();
		int hcf = 1;
		int lcm = 0;
		for (int i = 1; i<= firstnum && i<=secnum ; i ++) {
			if (firstnum % i == 0 && secnum % i == 0) {
				hcf = i;
			}
			
		}
		lcm = (firstnum * secnum)/hcf;
		System.out.println(lcm);

	}

}
