package Evaluation_Problems.Better_Than_Jenga;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int tc = scn.nextInt();
        for(int i = 0;i<tc;i++){
            String str = scn.next();
           
            betterThanJenga(str);
        }
    }
    public static void betterThanJenga(String str){
        Map<Character,Integer> map = new HashMap<>();
        
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else map.put(ch,1);
        }
        // System.out.println(map);
        int r = 0;
        int b = 0;
        for(char c:map.keySet()){
           if(c=='B')b = map.get(c);
           else r =  map.get(c);
        }
        if(r<b){
            if(r%2==1)System.out.println("Ankush");
            else System.out.println("Sachin");
        }else {
            if(b%2==1)System.out.println("Ankush");
            else System.out.println("Sachin");
        }
    }
}
