package collection;
import java.util.ArrayList;

public class arrlist {
	    public static void main(String[] args) {
	         ArrayList<Integer> num = new ArrayList<>();  
	        num.add(10);
	        num.add(20);
	        num.add(30);
	        num.add(40);
	        num.add(50);
	        System.out.println("Element- index 0: " + num.get(0));
	        System.out.println("Element - index 2: " + num.get(2));
	        System.out.println("Printing the elements in the arraylist ");
	        for (int i = 0; i < num.size(); i++) {
	         System.out.println("Element at index " + i + ": " + num.get(i));
	        }

            num.remove(1); 

	        System.out.println("updated ArrayList:");
	        for (Integer i : num) {
	            System.out.println("Element: " + i);
	        }
	        System.out.println("is 18 in ArrayList? " + num.contains(18));
	        System.out.println("Index of element 40: " + num.indexOf(40));
	        num.clear();
	        System.out.println("ArrayList is empty: " + num.isEmpty());
	    }
	}

