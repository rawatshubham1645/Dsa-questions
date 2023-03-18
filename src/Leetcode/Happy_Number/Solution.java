package Leetcode.Happy_Number;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean isHappy(int n) {
        
        
        List<Integer> list = new ArrayList<>();
        while(n!=1){
            
            int sum = 0;
           while(n!=0){
            int rem = n%10;
           n=n/10;
           sum += rem*rem;

           }
           n= sum;
           if(list.contains(n)){
               return false;
           }
           list.add(sum);
        }
         return true;
    }
}
