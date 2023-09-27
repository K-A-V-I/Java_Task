package Programs;

public class methoverload {
	
	//Method overloading ->two or more methods have the same name if they differ in parameters (type & no.)

    static void display(int a){
        System.out.println("Integer " +a);
    }

    static void display(String a, String b){
        System.out.println("String " +a +" " +b);
    }

    
    static void add(int x,int y) {
    	System.out.println(x+y);
    	}
    
    static void add(int x,int y, int z) {
    	System.out.println(x+y+z);
    	}
    
    
    public static void main(String[] args) {
        display(10);
        display("Hello","World");
        add(10,18);
        add(10,18,4);
	
}
}
