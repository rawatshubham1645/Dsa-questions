package Evaluation_Problems.Detect_Palindrone_II;

import java.util.HashMap;
import java.util.Map;


public class Main {
	public static void main(String[] args){
        
            int n = 6;
            String str = "abccba";
			/*
			 * Sample Input 1
			 * 
			 * 2 
			 * 6 aabbcc 
			 * 5 aabcd 
			 * 
			 * Sample Output 1
			 * Possible! 
			 * Not Possible!
			 */
            detectPalindrone(n,str);
       
    }
    
    public static void detectPalindrone(int n, String str){
    Map<Character,Integer> map = new HashMap<>();
    for(int i= 0;i<n;i++){
        char ch = str.charAt(i);
        if(map.containsKey(ch)){
            map.put(ch,map.get(ch)+1);
        }else{
            map.put(ch,1);
        }
        
        
    }
    int count = 0;
    for(Character c:map.keySet()){
        if(map.get(c)%2==1)count++;
            
    }
    System.out.println(count<=1?"Possible!":"Not Possible!");
    }
}
