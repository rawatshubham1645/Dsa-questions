package Leetcode.Next_Permutation;

public class Main {
	public static void main(String[] args) {
		int[] nums = {3,2,1};
		/*
		 * Input: nums = [1,2,3] Output: [1,3,2] Example 2:
		 * 
		 * Input: nums = [3,2,1] Output: [1,2,3] Example 3:
		 * 
		 * Input: nums = [1,1,5] Output: [1,5,1]
		 */
		int[] arr = nextPermutation(nums);
		for(int i:arr) {
			System.out.print(i+" ");
		}
	}
	 public static  int[] nextPermutation(int[] nums) {
	        // System.out.println(nums[nums.length-2]);        
	        int firstSmallestNo = -1;
	        for(int i = nums.length-2;i>=0;i--){
	                if(nums[i]<nums[i+1]){
	                    firstSmallestNo = i;
	                    break;
	                }
	        }
	        if(firstSmallestNo==-1)reverse(nums,0,nums.length-1);
	        else{

	        
	        int justgreaterThanFirstNo = 0;
	        for(int j = nums.length-1;j>=0;j--){
	            if(nums[j]>nums[firstSmallestNo]){
	                justgreaterThanFirstNo = j;
	                break;
	            }
	        }

	       swap(nums,firstSmallestNo,justgreaterThanFirstNo);
	       reverse(nums,firstSmallestNo+1,nums.length-1);
	       
	    }
	        return nums;
	    }
	    public static void swap(int[] nums, int i,int j){
	        int temp = nums[i];
	        nums[i] = nums[j];
	        nums[j] = temp; 
	    }
	    public static void reverse(int[] nums,int i,int j){
	        while(i<j)swap(nums,i++,j--);
	    }
}
