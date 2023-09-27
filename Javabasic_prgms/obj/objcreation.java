package obj;

public class objcreation {
	
	String name ="jessie";
	private int rollno = 22;
	
	public static void main(String[] args) {
		
		String name ="jack";
		int rollno = 23;
	
		objcreation obj = new objcreation();
		objcreation obj1 = new objcreation();
		
		System.out.println(obj.name);
		System.out.println(obj.rollno);
		
		System.out.println(obj1.name);
		System.out.println(obj1.rollno);
		
		System.out.println(name);
		System.out.println(rollno);
				
	}
}
