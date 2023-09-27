package obj;

public class staticpgm {
	
	    static int a = 10, c;// static variable
	
	    int multiply(int a, int b)
	    {
        return a * b;
         }
	    
	 // static blocks
	    static {
	        System.out.println("First Static block.");
	        c = a * 4;
	    }
	    
      //static method
       static int add(int a, int b)
       {
        return a + b;
       }

   public static void main( String[] args ) {

	    staticpgm st = new staticpgm();
	    
        System.out.println("Non Static Method  " + st.multiply(2,2));
        
        System.out.println("Static method  " + staticpgm.add(2,3));
        
        System.out.println("Static variable from same class " + (staticpgm.c + 10)); 
        
        System.out.println("Static variable from different class = " + (firstclasss.b + 10)); 

}
}
