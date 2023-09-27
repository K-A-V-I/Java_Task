package Programs;

public class subarrsum {
	    public static void main(String[] args) {
	        int[] arr = {1, 4, 20, 3, 10, 5};
	        int targetSum = 33;

	        findSubarray(arr, targetSum);
	    }

	    public static void findSubarray(int[] arr, int targetSum) {
	        int startIndex = 0;
	        int currentSum = arr[0];

	        for (int i = 1; i <= arr.length; i++) {
	            while (currentSum > targetSum && startIndex < i - 1) {
	                currentSum -= arr[startIndex];
	                startIndex++;
	            }

	            if (currentSum == targetSum) {
	                System.out.println("Subarray found between indexes " + startIndex + " and " + (i - 1));
	                return;
	            }

	            if (i < arr.length) {
	                currentSum += arr[i];
	            }
	        }

	        System.out.println("No subarray found with the given sum.");
	    }
}