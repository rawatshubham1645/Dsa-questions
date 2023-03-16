package Evaluation_Problems.Alternating_Characters;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int tc = scn.nextInt();
        for(int i = 0;i<tc;i++){
            String str = scn.next();
            alternating(str);
        }
        
    }
    public static void alternating(String str){
        int count = 0;
        for(int i = 0;i<str.length()-1;i++){
            char ch = str.charAt(i);
            if(ch=='A'){
                if(str.charAt(i+1)!='B')count++;
            }else{
                if(str.charAt(i+1)!='A')count++;
            }
        }
        System.out.println(count);
    }
}
