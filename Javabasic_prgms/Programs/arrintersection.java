package Programs;
import java.util.HashSet;

public class arrintersection {
	
	    public static void main(String[] args) {
	        int[] arr1 = {1, 2, 4, 5, 8};
	        int[] arr2 = {2, 3, 5, 7};

	        findIntersection(arr1, arr2);
	    }

	    public static void findIntersection(int[] arr1, int[] arr2) {
	        HashSet<Integer> set = new HashSet<>();
	        for (int num : arr1) {
	            set.add(num);
	        }

	        System.out.print("Intersection of the arrays: ");
	        for (int num : arr2) {
	            if (set.contains(num)) {
	                System.out.print(num + " ");
	            }
	        }
	    }

}
