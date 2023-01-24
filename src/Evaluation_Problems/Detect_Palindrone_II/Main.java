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

	/*
	 * The above code uses a hashmap to count the frequency of each character in the
	 * input string. Then it iterates over the values of the hashmap and counts the
	 * number of characters that have an odd count. If there are more than one
	 * characters with an odd count, it means that the string cannot be converted
	 * into a palindrome by rearranging its characters. If there is only one or less
	 * characters with an odd count, it means that the string can be converted into
	 * a palindrome.
	 */
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

//Time and Space Complexity
/*
 * The time complexity of the above implementation is O(n), where n is the
 * length of the input string. This is because we iterate over the input string
 * once to count the frequency of each character, and then we iterate over the
 * frequency counts to check if there are more than one characters with an odd
 * count. The time complexity of the HashMap's getOrDefault() and put() methods
 * is O(1) on average, and since we are calling those methods n times in total,
 * the overall time complexity of the function is O(n).
 * 
 * The space complexity of the above implementation is O(n) as well. This is
 * because we use a HashMap to store the frequency of each character in the
 * input string, and the maximum number of entries in the HashMap is equal to
 * the number of unique characters in the input string, which is at most n.
 */