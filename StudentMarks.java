package p1;

import java.util.Scanner;

/**
 * @author HP
 *
 */
public class StudentMarks {
	public static void main(String[] args) {
		System.out.println("Enter Marks");
		Scanner sc = new Scanner(System.in);
		
		int engMark=sc.nextInt();
		int java=sc.nextInt();
		int db=sc.nextInt();
		int springTools=sc.nextInt();
		
		int totalMarks = engMark+java+db+springTools;
		int avg = totalMarks/4;
		System.out.println("Total Marks = "+totalMarks);
		System.out.println("Average Marks = "+avg);
	}

}
