package excercises;

public class operators {
	public static void main(String args[]) {
		
		//assignment operator
		
		int a=5;  
		int b=2;  
	
		
		boolean x = true;
	    boolean y = false;
		
		//arithmetic
		
		System.out.println(a+b);  
		System.out.println(a-b);  
		System.out.println(a*b);  
		System.out.println(a/b);  
		System.out.println(a%b); 
		
		System.out.println(); 
		
		//unary
	
		System.out.println("postIncrement :"+ b++);  //print and increment
		System.out.println(b);
		System.out.println("PreIncrement :"+ ++b);  //increment and print (value taken from above statement.
		System.out.println("postDecrement :"+ b--);  
		System.out.println(b);
		System.out.println("PreDecrement :"+ --b);  
		System.out.println(b++ + ++b);
		
		System.out.println();
		
		//comparison
		
		 System.out.println("a < b : " + (a < b)); 
		 System.out.println("a > b : " + (a > b)); 
		 System.out.println("a >= b : " + (a >= b));
		 System.out.println("a <= b : " + (a <= b));
		 System.out.println("a == b : " + (a == b));
		 System.out.println("a != b : " + (a != b));
		 
		 
		 //instance of operator
		 //type comparison operator -> instance of which compares an object to a specified type.
		 
		 String test = "software testing";
		 Integer ab = 5;
		 boolean  result;
		 boolean  result2;
		 
		 result = test instanceof String;
	     result2=ab instanceof Integer;
		 System.out.println(result);	
		 
		
		 operators o1 = new operators();
		 result2= o1 instanceof operators;
		 System.out.println("checking the object " +result2);	
		 
		 
		 System.out.println();
		 
		 
		 // Logical Operator
		 
		 System.out.println("a && b = " + ((a>b) && (a>b)));
	     System.out.println("x || y = " + (x || y) );
	     System.out.println("!(x && y) = " + !(x && y));
	     
	     System.out.println();
	     
	     
	     //ternary operator
	     
		 String c=(a>b)? "YES" : "NO";
		 System.out.println(c);
		
		 System.out.println();
		
		 
		// bitwise Operator
		
		 System.out.println("a&b = " + (a & b) );
		 System.out.println("a|b = " + (a | b));
		 System.out.println("a^b = " + (a ^ b));
		 System.out.println("~b = " + ~b);
		
		 System.out.println();
		 
		 
		 //shift operator
		 
		 int r = a >> 2 ; //d=a/2^n
		 System.out.println("Right shift = "+r);
		 int l = a << 2 ; //d=a*2^n
		 System.out.println("Right shift = "+l);
		 int unsignedleft = a>>>2;
		 System.out.println("UnSigned Left shift " +unsignedleft);
		 
		 System.out.println();
		 
		 
		}

}
