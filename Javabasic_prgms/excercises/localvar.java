package excercises;

public class localvar {
	
	public void studentage()
	
	{
		int age =15;
		age = age + 3;
		System.out.println("Student age is "+ age);
	}
	
	public static void main(String args[]) {
		localvar obj = new localvar();
		obj.studentage();
	}

	
//	public static void main(String args[]) {
//		System.out.println("Student age is "+ age);
//		}
	
}
