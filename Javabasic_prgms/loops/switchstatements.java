package loops;

import java.util.Scanner;

public class switchstatements {
	public static void main(String args[]) {
		
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Wlecome to Hakuna Matata! ");
		    System.out.println("Enter your role: ");
		    String role = sc.next();
		 
		    switch (role) {
		      case "admin":
		        System.out.println("All Access granted");
		        break;
		      case "manager":
		           System.out.println("Particular Access is granted");
		            break;
		      case "employeee":
		            System.out.println("Access with restriction");
		            break;
		          default:
		            System.out.println("Access denied");
		            break;
		    }
	}
	
}
