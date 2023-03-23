package Masai.Cows_And_Bulls;
import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int tc = scn.nextInt();
        for(int k = 0;k<tc;k++){
            int n = scn.nextInt();
            String str1 = scn.next();
            String str2 = scn.next();
            int [] arr1 = new int[n];
            for(int i = 0;i<n;i++){
                arr1[i] = Character.getNumericValue(str1.charAt(i));
            }
            int [] arr2 = new int[n];
            for(int i = 0;i<n;i++){
                arr2[i] = Character.getNumericValue(str2.charAt(i));
            }
            cowsAndBulls(n,arr1,arr2);
        }
    }
    public static void cowsAndBulls(int n, int[] arr1, int[] arr2){
        
        int[] temp1 = new int[10];
        int[] temp2 = new int[10];
        Arrays.fill(temp1,0);
        Arrays.fill(temp2,0);
        int bulls = 0;
        for(int i = 0;i<arr1.length;i++){
            if(arr1[i] == arr2[i]){
                bulls++;
            }
            else{
                
                temp1[arr1[i]]++;
                temp2[arr2[i]]++;
            }
        }
        int cows = 0;
        for(int i = 0;i<temp2.length;i++){
            cows+=Math.min(temp1[i],temp2[i]);
        }
        System.out.println(bulls+"A"+cows+"B"); //Hello
    }
}
