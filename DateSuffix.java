package p1;

import java.util.Scanner;

public class DateSuffix {
	public static void main(String[] args) {
		System.out.println("Enter Date");
		Scanner sc= new Scanner(System.in);
		
		int date = sc.nextInt();
		if(date%10==1)
			System.out.println("Date = "+date+"st");
		else if(date%10==2)
			System.out.println("Date = "+date+"nd");
		if(date%10==3)
			System.out.println("Date = "+date+"rd");
		else
			System.out.println("Date = "+date+"th");
	}

}
