package Evaluation_Problems.Election_Campaign;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int tc = scn.nextInt();
        for(int k = 0;k<tc;k++){
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = scn.nextInt();
                
            }
            election(n,arr);
            election2(n,arr);
        }
    }
    public static void election(int n, int[] arr){
        int max = -1;
        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j<n;j++){
                int h = Math.min(arr[i],arr[j]);
                int w = j-i;
                max = Math.max(w*h,max);
            }
        }
        System.out.println(max);
    }
    
    //time ->O(N2)
    
    //Optimize approach
    public static void election2(int n, int[] arr){
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
        System.out.println(maxArea);
    }
}
