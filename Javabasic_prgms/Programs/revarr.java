package Programs;

import java.util.Arrays;

public class revarr {
	public int[] arrayRev(int[] arr)
	   {
	      for(int a = 0; a < arr.length / 2; a++)
	      {
	         int temp = arr[a];
	         arr[a] = arr[arr.length - 1 - a];
	         arr[arr.length - 1 - a] = temp;
	      }
	      return arr;
	   }
	   public static void main(String[] args)
	   {
		   revarr obj = new revarr();
	      int[] arr = {2, 4, 6, 8, 10};
	      System.out.println("Given array: " + Arrays.toString(arr));
	      System.out.println("Reversed array: " + Arrays.toString(obj.arrayRev(arr)));
	   }

}
