package loops;

import java.util.Scanner;

public class whileloop {
	public static void main(String args[]) {
		
		// while loop is used to execute a set of statements repeatedly until the specified condition returns false
				
		  int i, sum = 0;
	      Scanner sc = new Scanner(System.in);    
	      System.out.println(" Enter the number: ");
	      i = sc.nextInt();
	         
	      while (i <= 10)  {
	    	  sum = sum + i;
	          i++;
	         }
	        System.out.println(" sum of the numbers "+ sum);
	    }

}