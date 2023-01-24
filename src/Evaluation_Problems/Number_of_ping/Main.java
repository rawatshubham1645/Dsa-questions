package Evaluation_Problems.Number_of_ping;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int n = 7;
        String str = "pingping";
        numberOfPing(n,str);
    }
    public static void numberOfPing(int n, String str){
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        
        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='p')a++;
            else if(ch=='i')b++;
            else if(ch=='n')c++;
            else d++;
        }
        System.out.println(Math.min(a,Math.min(b,Math.min(c,d))));
 /* Math.min(p, Math.min(i, Math.min(n, g))) will return the minimum of the four 
variables.
In the first step, it will find the minimum of p and i using Math.min(p, i) which will 
be the minimum of p and i and assigns the returned value to a variable.
In the next step, it finds the minimum of the above returned value and n using Math.min
(previous_returned_value, n) which will be the minimum of p, i and n.
In the final step, it finds the minimum of the above returned value and g using 
Math.min(previous_returned_value, g) which will be the minimum of p, i,n and g

So at the end, the returned value will be the minimum of the four variables p, i, n, 
and g which is the maximum number of times that the string "ping" can be constructed 
using the characters in the input string.*/
    }
}


//Time Complexity - O(n)
//space - O(1)