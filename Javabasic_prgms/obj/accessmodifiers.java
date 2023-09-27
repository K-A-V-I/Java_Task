package obj;

public class accessmodifiers {
	
	public void display()
		{
			System.out.println("Hello Guyss");
		}
	}

	class B extends accessmodifiers
	{
	public static void main(String args[])
		{
			accessmodifiers myobj = new accessmodifiers();
			myobj.display();
		}
	}


