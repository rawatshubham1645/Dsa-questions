package Masai.reverse_Vowels;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int tc = scn.nextInt();
        for(int k = 0;k<tc;k++){
            String str = scn.next();
            reverseVowels(str);
        }
    }
    public static void reverseVowels(String str){
        int l = 0;
        int r = str.length()-1;
        char[] chars = str.toCharArray();
        while(l<r){
            if(isvowel(chars[l])&& isvowel(chars[r])){
                swap(chars,l,r);
                l++;
                r--;
            }
            if(!isvowel(chars[l])){
                l++;
            }
            if(!isvowel(chars[r])){
                r--;
            }
        }
        // System.out.println(new String(chars));
        for(char c:chars){
            System.out.print(c);
        }
        System.out.println();
    }

    public static boolean isvowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ;
    }

    public static void swap(char[] chars, int l, int r) {
        char temp = chars[l];
        chars[l] = chars[r];
        chars[r] = temp;
    }
}
