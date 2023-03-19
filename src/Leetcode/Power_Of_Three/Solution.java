package Leetcode.Power_Of_Three;

class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0)return false;
        if(n==1)return true;
        long i = 3;
        long j= 0;
        while(i<=n){
             if(n==i)return true; 

            i = (long)Math.pow(3,j++);
            
           
        }
        return false;
    }
}
