package loops;

import java.util.Scanner;

public class ifelseif {
	public static void main (String args[]) {
		
	//	int marks = 98;
		int marks;
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter your Mark: ");
	     marks = sc.nextInt();
		
		if (marks>=95 && marks <=100)
		{
			System.out.println("Firts Class");
			}
		else if(marks >=80 && marks<95) {
			System.out.println("Second Class");
		}
		else if(marks >=50 && marks < 80)
		{
			System.out.println("Third Class");
		}
		else if( marks < 50 && marks > 0)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Please enter the valid marks");
		}
	}

}
