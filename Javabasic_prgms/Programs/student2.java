package Programs;

public class student2 {
	
	       int rollno;
	       String name;

	       student2()      
	       {
                rollno = 101;
	            name = "doe";
	       }

	       void show()
	       {
	             System.out.println("Roll num = " + rollno);
             System.out.println("Name = " + name);
       }

	       public static void main(String args [])
	       {
	             student2 obj = new student2();
	             obj.show();
      }
	 }


