import java.util.Scanner;

public class DispalyHCF {

	public static void main(String[] args) {
		System.out.println("Enter any first numbers");
		Scanner scan = new Scanner (System.in);
		int fnum = scan.nextInt();
		System.out.println("Enter any Second numbers");
		int snum = scan.nextInt();
		int hcf = 1;
		
		for (int i = 1; i<= fnum && i<= snum; i ++){
			if(fnum % i == 0 && snum % i == 0 ){
				hcf = i;
			}		
		}
		System.out.println("HCF of given numbers is " + hcf );
		
	}
	}
