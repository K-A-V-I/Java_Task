package loops;

public class nestedif {
	public static void main(String args[]) {
		int a =5, b=7,c=5;
 
        if (a == b) {
            if (a == c) {
                         System.out.println("Equal");
            } else {
                         System.out.println("Not equal");
            }
        } else {
                      System.out.println("Nott equal");
        }
	}

}
