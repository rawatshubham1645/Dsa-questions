package Evaluation_Problems.Getting_Heated;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int tc = scn.nextInt();
        for(int i = 0;i<tc;i++){
            int n = 3;
            int[] arr = new int[3];
            for(int j = 0;j<3;j++){
                arr[j] = scn.nextInt();
            }
            System.out.println(gettingHeated(n,arr));
        }
    }
    public static String gettingHeated(int n, int[] arr){
        
        if(arr[0]<=arr[1] && arr[1]>=arr[2])return "AC";
        else return "No AC";
    }
}
