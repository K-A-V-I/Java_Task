package loops;

import java.util.Scanner;
public class dowhileloop {
	public static void main (String args[]) {
		
		int i=1, n;
		System.out.println("Enter any number ");
		Scanner sc = new Scanner (System.in);
		n = sc.nextInt();
		do{
			System.out.println(n+" * "+i+" = "+n*i);
		    i++;
		}while(i <= 10); 
	}

}


