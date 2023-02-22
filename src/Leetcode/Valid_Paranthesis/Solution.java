package Leetcode.Valid_Paranthesis;

import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
         Stack<Character> stack = new Stack<>();
        for(int i = 0;i<s.length();i++){
            char ch = s.charAt(i);
           
            if(ch=='(' || ch=='[' || ch == '{'){
                stack.push(ch);
            }else if(ch==')'){
                if(stack.isEmpty()){
                    return false;
                    
                }else if(stack.peek()!='('){
                    return false;
                }else{
                    stack.pop();
                }
            }
            else if(ch==']'){
                if(stack.isEmpty()){
                    return false;
                    
                }else if(stack.peek()!='['){
                    return false;
                }else{
                    stack.pop();
                }
            }
            else if(ch=='}'){
                if(stack.isEmpty()){
                    return false;
                    
                }else if(stack.peek()!='{'){
                    return false;
                }else{
                    stack.pop();
                }
            }else{
                return false;
            }
        }
        if(stack.isEmpty())return true;
        else return false;
    }
}
