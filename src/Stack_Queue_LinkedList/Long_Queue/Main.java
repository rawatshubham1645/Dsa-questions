package Stack_Queue_LinkedList.Long_Queue;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        longQue(arr);
    }
    public static void longQue(int[] arr){
        int count = 1;
        for(int i = 1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                count++;
            }
        }
        System.out.println(count);
    }
}
