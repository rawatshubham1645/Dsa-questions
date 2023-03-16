package Evaluation_Problems.Mark_And_Toys;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        markToys(n,arr,k);
    }
    public static void markToys(int n, int[] arr, int k){
        
        int sum = 0;
        int count = 0;
        Arrays.sort(arr);
        int i = 0;
    while(k>0){
        if(k-arr[i]>=0){
            k = k-arr[i];
            count++;
            i++;
        }else{
            System.out.println(count);
            return;
        }
    }
    //System.out.println(count); //If I buy all the toys
}
}
