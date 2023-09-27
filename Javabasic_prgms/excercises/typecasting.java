package excercises;

public class typecasting {

	public static void main(String[] args) {
		
		//Widening Casting (automatically)--> converting a smaller type to a larger type size
         // byte -> short -> char -> int -> long -> float -> double
		
		byte n1 = 18;
		short n2 = n1;
		int n3 = n2;
	    double n4 = n3; 
	

	    System.out.println(n1);      
	    System.out.println(n2);
	    System.out.println(n3);
	    System.out.println(n4);
	    
	    System.out.println("-----");
	    
	    // Narrowing Casting (manually) - converting a larger type to a smaller size type
	    //   double -> float -> long -> int -> char -> short -> byte
	    
	    double a = 18.10d;
	    float b = (float) a;
	    long c = (long) a;
	    int d = (int) a; 
	    byte e = (byte)a;	    
	    

	    System.out.println(a); 
	    System.out.println(b);  
	    System.out.println(c); 
	    System.out.println(d); 
	    System.out.println(e); 

	}

}
