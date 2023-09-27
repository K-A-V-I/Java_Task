package loops;


public class foreachloop {

	public static void main(String[] args) {
		
		int temp;
		
	      int array[] = {10, 20, 25, 63, 98 ,106,96, 57};
	     
	      for(int i = 0; i<array.length; i++ )
	      {
	         for(int j = i+1; j<array.length; j++)
	         {
	            if(array[i]>array[j]){
	               temp = array[i];
	               array[i] = array[j];
	               array[j] = temp;
	            }
	         }
	      }
	      System.out.println("largest element is  "+array[array.length-1]);
	   }
		

	}


