package Programs;

public class student {
	int rollno;
	String name;
	
	student(int rollno, String n)
	{
		this.rollno = rollno; //compiler confused b/w instance variable and local variable so use this keyword
		name =n;
	}
	void display()
	{
		System.out.println("roll no = "+rollno + "  name = "+name);
	
	}
	
	public static void main(String args[])
	{
		student s1 = new student(1,"joe");
	    s1.display();
		
		student s2 = new student(2,"jesii");
		s2.display();
		
		student s3 = new student(3,"jessika");
		s3.display();
	}
	
}
