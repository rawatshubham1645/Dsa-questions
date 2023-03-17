package Leetcode.Majority_Element;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public int majorityElement(int[] arr) {
        
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length ;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        // System.out.println(map);
        // return 1;
        int n = arr.length/2;
        int ans = 0;
        for(Integer i: map.keySet()){
            if(map.get(i)>n)ans = i;
        }
        return ans;
    }
}
