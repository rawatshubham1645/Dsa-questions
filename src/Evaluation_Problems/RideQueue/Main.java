package Evaluation_Problems.RideQueue;

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
            ride(n,arr);
        }
    }
    public static void ride(int n, int[] arr){
        int count = 1;
        for(int i = 0;i<n-1;i++){
            if(arr[i+1]<=arr[i])count++;
        }
        System.out.println(count);
    }
}
