package Masai.Subarray_sum_equal_to_given_sum;

public class Main {
	public static void main(String[] args) {
		int k = 0;
		int n = 2;
		int[] arr = {1, 4};
		System.out.println(sumOfSubrray(n,arr,k));
	}
	public static String sumOfSubrray(int n,int[] arr, int k){
	    int l = 0;
	    int start = 0;
	    int currSum = 0;
	    	
	    while(l<n) {
	    	currSum+=arr[l];
	    	
	    	while(currSum>k && start<l) {
	    		currSum -= arr[start++];
	    	}
	    	if(currSum == k)return "Yes";
	    	l++;
	    }
	    return "No";	    
	    }
}
/*
 * Let's say the input array is {1, 2, 3, 4, 5} and the target sum is 8.
 * 
 * Initialize the start pointer to 0, the end pointer to 0, and the sum to 0.
 * Add the first element of the array (1) to the sum (sum = 1). Move the end
 * pointer to the next element (2) and add it to the sum (sum = 3). Move the end
 * pointer to the next element (3) and add it to the sum (sum = 6). Move the end
 * pointer to the next element (4) and add it to the sum (sum = 10). Since the
 * sum is greater than the target sum (10 > 8), we move the start pointer to the
 * right (start = 1) and subtract the value at that position from the sum (sum =
 * 9). Move the end pointer to the next element (5) and add it to the sum (sum =
 * 14). Since the sum is still greater than the target sum (14 > 8), we move the
 * start pointer to the right (start = 2) and subtract the value at that
 * position from the sum (sum = 11). Since the sum is still greater than the
 * target sum (11 > 8), we move the start pointer to the right (start = 3) and
 * subtract the value at that position from the sum (sum = 8). Since the sum is
 * now equal to the target sum (8 == 8), we print "YES" and return.
 */