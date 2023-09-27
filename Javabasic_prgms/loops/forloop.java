package loops;

//for loop -> we know the no. of times it will be execute
//for -> loops to execute code repeatedly until a condition is met

public class forloop {
	public static void main(String args[]) {
		for(int i = 1; i <=10; i++) {
            System.out.println(i + " x " +"5" + " = " +(i*5));
		}
		
		//-------------------------------------------------------
		
		  for(int i = 0; i<5; i++);
		    {
			  System.out.println("Hello world");
		    }
		
		//---------------------------------------------------
		    
		    int i,j;
		    for (i=0; i<4; i++) 
		    {
		    	for (j=i; j>=0; j--)
		    	System.out.print(j);
		    	System.out.println();
		    }
		
	}

}
