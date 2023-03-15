package Leetcode.Climbing_Stairs;

import java.util.Arrays;

class Solution {
    public int climbStairs(int n) {
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
       return recursion(dp,n);
        
    }
    public static int recursion(int[] dp,int n){
        if(n==0)return 1;
        if(n<0)return 0;
        if(dp[n] != -1)return dp[n];
        dp[n] = recursion(dp,n-1) + recursion(dp,n-2);
        return dp[n];
    }
}

//Time - O(n) because the function recursion is called at most n times, and each call takes constant time to complete.
//Space - O(n) because an array of size n+1 is created to store the values of the dynamic programming approach, and
//each value stored in the array takes constant space.

// Without Dp the time complexity is O(2^n)
