package Leetcode.Choclate_Distribution;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		long arr[] = {7, 3, 2, 4, 9, 12, 56};
		int m = 3;
		
		System.out.println(choclate(m,arr));
	}
	private static long choclate(int m,long[] arr) {
		int n = arr.length;
		
        Arrays.sort(arr);
        long min = Long.MAX_VALUE;
        
        long diff = 0;
        for(int i = 0;i<=n-m;i++){
            
            diff = arr[i+m-1] - arr[i];
            if(diff<min)min=diff;
        }
        
        return min;
    }
		
	}

//output-> 2