package Leetcode.Maximum_Subarray;


//O(N) Kadane's algorithm
class Solution {
    public int maxSubArray(int[] nums) {
       int max = nums[0];
       int sum = 0;
       for(int i = 0;i<nums.length;i++){
           sum+=nums[i];
            max = Math.max(max,sum);
            if(sum<0)sum=0;
       }
        return max;
        
    }
}
//input->[-2,1,-3,4,-1,2,1,-5,4]
//output->6
//input1->[-2,-1]
//output->-1


//time-O(N2)
/*
class Solution {
  public int maxSubArray(int[] nums) {
      int max = nums[0];
      if(nums.length==1)return nums[0];
      for(int i = 0;i<nums.length;i++){
          int sum = 0;
         for(int j = i;j<nums.length;j++){
              sum+=nums[j];
              max=Math.max(sum,max);
              
         }
          
      }
      return max;
  }
}
*/