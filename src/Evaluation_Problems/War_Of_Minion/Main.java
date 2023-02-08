package Evaluation_Problems.War_Of_Minion;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        String str = scn.next();
        warOfMinion(n,str);
    }
    public static void warOfMinion(int n, String str){
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<n;i++){
            char ch = str.charAt(i);
            if(stack.isEmpty()){
                stack.push(ch);
            }
            else{
                if(stack.peek()==ch && !stack.isEmpty()){
                    stack.pop();
                }else stack.push(ch);
            }
        }
         if(stack.isEmpty())System.out.println(-1);
         
        if(!stack.isEmpty()) {
          StringBuilder sb = new StringBuilder();
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        System.out.print(sb.reverse().toString());
       
    }
}
}