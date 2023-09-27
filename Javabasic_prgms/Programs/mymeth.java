package Programs;

public class mymeth {
	
	 public int addnum(int a, int b) {
		    int sum = a + b;
		    return sum;
		}
	 
	  void add(int a, int b, int c){
		  System.out.println("sum = "+(a+b+c));
	    } 
	  
	  void conc(String c,String d) {
		  System.out.println(c+d);  
	   }
	 
	       public static void main(String[] args) {
		    
		    int num1 = 18, num2=10;
		    mymeth obj = new mymeth();
		    int result = obj.addnum(num1, num2);
		    System.out.println("Sum is: " + result);

		    mymeth ad=new mymeth();
	        ad.add(5,6,7);
	        ad.conc("Hello ","World");
		       
		    
	  }
}
