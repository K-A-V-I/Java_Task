package inhertance;

import java.util.Scanner;

class shape1 {
	int l,b,area;
		public void  calarea() {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter length and breadth = ");
		l=sc.nextInt();
		b=sc.nextInt();
		area=l*b;
	
	}
}
class rectangle1 extends shape1{
	
	void display() {
		System.out.println("Area of rectangle "+ area);
	}
	
	public static void main(String args[]) {
		rectangle1 rec = new rectangle1() ;
		rec.calarea();
		rec.display();
		
	}
}
