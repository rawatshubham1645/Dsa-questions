package Stack_Queue_LinkedList.Reduce_String;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        reduceString(str);
    }
    public static void reduceString(String str){
        
        
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(stack.isEmpty()){
               stack.push(ch); 
            }else{
                if(stack.peek()==ch){
                    stack.pop();
                }else stack.push(ch);
            }
            // stack.push(ch);
        }
        if(stack.isEmpty())System.out.println("Empty String");
        else {
            for(Character c:stack)System.out.print(c);
        }
    }
}
//Space complexity-> O(n)
//Time Complexity-> O(n)