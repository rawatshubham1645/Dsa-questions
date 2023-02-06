package Evaluation_Problems.Make_LeaderBoard;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] names = new String[n];
        int[] marks = new int[n];
        for(int i = 0;i<n;i++){
            names[i]= scn.next();
            marks[i] = scn.nextInt();
        }
        nSort(names,marks);
        mSort(names, marks);
        display(names, marks);
    }
    public static boolean check(String a, String b){
        for(int i = 0;i<Math.min(a.length(),b.length());i++){
            if(a.charAt(i)!=b.charAt(i)){
            if(a.charAt(i)>b.charAt(i))return true;
            else return false;
            }
        }
        return false;
    }
    public static void nSort(String[] n, int[] m){
         for(int i = 0;i<n.length-1;i++){
            for(int j = 0;j<n.length-i-1;j++){
                if(check(n[j], n[j+1])){
                    swap(n,m,j,j+1);
                }
            }
            
        }
    }
    public static void mSort(String[] n, int[] m){
        for(int i = 0;i<m.length-1;i++){
            for(int j = 0;j<m.length-i-1;j++){
                if(m[j]<m[j+1]){
                    swap(n,m,j,j+1);
                }
            }
            
        }
    }
    public static void display(String[] n, int[] m){
        int prev = -1;
        int rank = 1;
        int count = 0;
        for(int i = 0;i<n.length;i++){
            if(m[i]==prev)System.out.println(rank+" "+n[i]+" "+m[i]);
            else {
                rank+=count;
                System.out.println(rank+" "+n[i]+" "+m[i]);
                count=0;
            }
            count++;
            prev = m[i];
        }
    }
    public static void swap(String[] n, int[] m, int i, int j){
        int temp = m[i];
        m[i] = m[j];
        m[j] = temp;
        
        String s = n[i];
        n[i] = n[j];
        n[j] = s;
    }
}
