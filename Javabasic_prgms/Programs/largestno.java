package Programs;
import java.util.*;
public class largestno {
	// public static void main(String[] args) {
	//	 int num[] = {19, 29, 25, 82, 98, -1, 53, 55};
//	      int n = num.length;
//	      Arrays.sort(num);
//	      System.out.println("largest number : "+num[n-1]);
	
		 
		 static int largest()
		    {
		   int num[] = {19, 29, 25, 82, 98, -1, 53, 55};
		       int max = num[0];
		          for (int i = 1; i < num.length; i++)
		            if (num[i] > max)
		                max = num[i-1];
		                return max;
		    }
		 
		    public static void main(String[] args)
		       {
		    	 System.out.println("Second Largest in given array is " + largest());
		        }
	 
	   }


