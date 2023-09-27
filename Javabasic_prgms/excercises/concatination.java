package excercises;

import java.lang.*;

public class concatination {

	public static void main(String[] args) {
		
		String a = "Hello everyone";
	    String b = " World hope";
	    String c= " Hello";
	    System.out.println(a+b);
	    System.out.println(a.concat(b));
	    
	    System.out.println(a.length());
	    System.out.println(a.toUpperCase());
	    System.out.println(b.toLowerCase());
	    
	    System.out.println(a.compareTo(c)); //based on the Unicode value
	    
	    System.out.println(a.equals(c)); 
	    
	    System.out.println(b.trim()); // remove space
	    
	    System.out.println(a.charAt(0));   // Returns the character at the specified index
	    
	    System.out.println(a.codePointAt(0)); //Returns the Unicode of the character at the specified index
	    
	    System.out.println(a.codePointBefore(2)); // Returns the Unicode of the character before the specified index
	    
	    System.out.println(a.codePointCount(0, 5)); //Returns the number of Unicode values found in a string.
	    
	    System.out.println(a.replace('l', 'p')); // Searches a string for a specified value, and returns a new string where the specified values are replaced
	  
	    System.out.println(a.contains("Hel")); // Checks whether a string contains a sequence of characters return boolean value
	    
	    System.out.println(a.hashCode()); // return hash code
	    
	    System.out.println(a.indexOf("everyone"));
	    
	    System.out.println(b.lastIndexOf("hope"));
	    
	    String name = "Kavipriya", name1="";
	    char rv;
      //  System.out.println(name.reverse());
            
            
            for (int i=0; i<name.length(); i++)
            {
              rv= name.charAt(i); 
              name1= rv+name1; 
            }
            System.out.println("Reversed word: "+ name1);
            
            
            int value=18;  
            String s1=String.valueOf(value);  // valuesOf -> convert any type into string
            System.out.println(s1+10);
            
            
            
            
            
	}
}
