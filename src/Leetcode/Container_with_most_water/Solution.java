package Leetcode.Container_with_most_water;

public class Solution {
 public static int container(int[] arr) {
        
int l = 0;
int r = arr.length-1;
int maxArea = 0;
while(l<r){
    int width =r-l;
    int height = Math.min(arr[l],arr[r]);
    maxArea =Math.max(maxArea,height*width);
    if(arr[l]<arr[r])l++;
    else r--;
     
}
return maxArea;
    }
 public static void main(String[] args) {
	 int[] arr = {1,8,6,2,5,4,8,3,7};
	System.out.println(container(arr)); ;
 }
}
