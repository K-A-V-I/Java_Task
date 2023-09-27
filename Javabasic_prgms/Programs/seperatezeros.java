package Programs;

public class seperatezeros {
	    public static void main(String[] args) {
	        int[] arr = {0, 2, 0, 1, 3, 0, 4};
	        separateZeros(arr);
	        System.out.print("Array after separating zeros: ");
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	    }

	    public static void separateZeros(int[] arr) {
	        int nonZeroIndex = 0;

	        for (int num : arr) {
	            if (num != 0) {
	                arr[nonZeroIndex] = num;
	                nonZeroIndex++;
	            }
	        }

	        while (nonZeroIndex < arr.length) {
	            arr[nonZeroIndex] = 0;
	            nonZeroIndex++;
	        }
	    }
	}

