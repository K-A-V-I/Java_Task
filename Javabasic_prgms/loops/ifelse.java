package loops;
import java.util.Scanner;

public class ifelse {
	public static void main(String args[]) {
		
		int age;
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter your age: ");
	     age = sc.nextInt();
 
	     if (age >= 18) {
	           System.out.println("eligible to vote");
	        } 
	     else {
	            System.out.println("You are not eligible to vote");
	        }
		
	}

}
