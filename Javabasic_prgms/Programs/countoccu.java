package Programs;

import java.util.Scanner;

public class countoccu {
	
	public static void main(String[] args) {
			int Size, i, num, occr = 0;
			
			Scanner sc = new Scanner(System.in);
			System.out.print("Please Enter the Array size = ");
			Size = sc.nextInt();
			
			int[] arr = new int[Size];
			
			System.out.format("Enter the Array %d elements : ", Size);
			for(i = 0; i < Size; i++) 
			{
				arr[i] = sc.nextInt();
			}
			
			System.out.print("check the occorance of num = ");
			num = sc.nextInt();
			
			for(i = 0; i < arr.length; i++) 
			{
				if(arr[i] == num)
				{
					occr++;
				}
			}
			
			System.out.println(num + " Occurred " + occr + " Times.");
		}
}


