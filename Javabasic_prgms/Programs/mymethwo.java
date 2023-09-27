package Programs;

public class mymethwo {
	
	 public static int rec() {
	      int l=10,b=12;
	      int area = l*b;
	      return area;
	   }
	 
	   public static void main(String[] args) {
	  
	      int recarea;
	      recarea=rec();
	      System.out.println("The area of Rectangle is: " + recarea);

	   }
}
