import java.time.LocalDate;
import java.util.Scanner;

public class DifferenceBetweenTwoDates {

	public static void main(String[] args) {
		System.out.println("Enter Year,Month and Day of First Date");
		Scanner scan = new Scanner(System.in);
		int year1 = scan.nextInt();
		int month1 = scan.nextInt();
		int day1 = scan.nextInt();

		System.out.println("Enter the Year, Month and Day of second Date");
		int year2 = scan.nextInt();
		int month2 = scan.nextInt();
		int day2 = scan.nextInt();

		LocalDate date1 = LocalDate.of(year1, month1, day1);
		LocalDate date2 = LocalDate.of(year2, month2, day2);

		System.out.println(date1);
		System.out.println(date2);
//		
//		if(date1 > date2) {
//
//			int diffyear = year1 - year2;
//			int diffmonth = month1 - month2;
//			int diffday = day1 - day2;
//		}
//		else {
//			int diffyear = year2 - year1;
//			int diffmonth = month2 - month1;
//			int diffday = day2 - day1;
//		}
		int diffyear = Math.abs(year1 - year2);
		int diffmonth = Math.abs(month1 - month2);
		int diffday = Math.abs(day1 - day2);
		

		System.out.println(diffyear);
		System.out.println(diffmonth);
		System.out.println(diffday);
		
		LocalDate differenceDate = LocalDate.of(diffyear, diffmonth, diffday);
		System.out.println(differenceDate);
		
		//CONVERTING DATE INTO DAYS 
		if(diffyear % 4 == 0 && diffyear % 100 != 0 || diffyear % 400 == 0) {
			diffyear = diffyear *366;
		}
		else {
			diffyear = diffyear * 365;
		}
		if (diffmonth == 2 && diffyear % 400 == 0 || diffyear % 4 == 0 && diffyear % 100 != 0) {
			diffmonth = diffmonth * 29;
		} else  {
			diffmonth = diffmonth * 28;
		}
		if (diffmonth == 1 || diffmonth == 3 || diffmonth == 5 || diffmonth == 7 || diffmonth == 10 || diffmonth == 12) {
			diffmonth = diffmonth * 31;
		}
		else {
			diffmonth = diffmonth * 30;
		}

		int totalDays = ((diffyear)+(diffmonth)+(diffday));
		System.out.println("The didfference between two dates  is " + differenceDate + "and in days is " +totalDays);
	}

}

