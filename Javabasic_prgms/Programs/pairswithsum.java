package Programs;

public class pairswithsum {
	    public static void main(String[] args) {
	        int[] arr = {1,2,3,4,5,6,7,8,9};
	        int targetsum = 11;

	        System.out.println("Pairs with sum " + targetsum + ":");
	        pairs(arr, targetsum);
	    }

	    public static void pairs(int[] arr, int targetsum) {
	        for (int i = 0; i < arr.length; i++) {
	            for (int j = i + 1; j < arr.length; j++) {
	                if (arr[i] + arr[j] == targetsum) {
	                    System.out.println(arr[i] + " + " + arr[j] + " = " + targetsum);
	                }
	            }
	        }
} }



