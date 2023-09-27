package Programs;

public class breakdemo {
	public static void main(String[] args) {
        int count = 1;
        while (true) {
            System.out.println("Count: " + count);
            count++;
            if (count == 5) {
                break; 
            }
        }
        System.out.println("Loop exited.");
    }

}
