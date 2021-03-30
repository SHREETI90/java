package p1;

import java.util.Scanner;

public class SalaryBreakUp {
	public static void main(String[] args) {
		System.out.println("Enter basic Salary");
		Scanner sc= new Scanner(System.in);
		
		int basicSalary = sc.nextInt();
		
		int HRA,DA,tax,annualSal,sum;
		HRA = (4/10) * basicSalary;
		DA = (6/10) * (basicSalary + HRA);
		sum = basicSalary +HRA + DA;
		
		{
			if(basicSalary<200000)
				tax = 0;
			else if(basicSalary>=200000 && basicSalary<600000 )
				tax = (1/10)*sum;
			else
				tax = (2/10)*sum;
		}
		
		annualSal = sum - tax;
		System.out.println("Annual Salary = "+annualSal);
		
	}

}
