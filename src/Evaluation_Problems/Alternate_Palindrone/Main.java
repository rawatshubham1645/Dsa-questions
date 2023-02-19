package Evaluation_Problems.Alternate_Palindrone;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int tc = scn.nextInt();
        for(int k= 0;k<tc;k++){
            int n = scn.nextInt();
            String str= scn.next();
           System.out.println(alternate(n,str)?"Yes":"No") ;
        }
    }
    public static boolean alternate(int n, String str){
        Map<Character,Integer> map = new HashMap<>();
        for(int i = 0;i<n;i++){
            char ch  = str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int count =0;
        for(int i: map.values()){
            if(i % 2==1)count++;
        }
      return count<=1;
        
    }
}
