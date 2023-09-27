package inhertance;

class A{
public void A()
{
	System.out.println("Class A Method");
	}
}
class B extends A{
public void B()
{
	System.out.println("Class B Method");
	}
}
class C extends B{
public void C()
{
	System.out.println("Class C Method");
	}
}
public class multilevel extends C {
	public static void main(String args[]) {
		multilevel ml = new multilevel();
		System.out.println("Multilevel Method");
		ml.A();
		ml.B();
		ml.C();
	
		
	}

}
