package Masai.Track_Typing_Speed;

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String keyboard = scn.next();
        String word = scn.next();
        int result = trackTime(keyboard, word);
        System.out.println(result);
    }

    public static int trackTime(String keyboard, String word) {
        int currentPos = 0;
        int time = 0;
        for(int i = 0;i<word.length();i++){
            for(int j = 0;j<keyboard.length();j++){
                if(word.charAt(i)==keyboard.charAt(j)){
                    int nextPos = j;
                    time+=Math.abs(currentPos-nextPos);
                    currentPos = nextPos;
                    // break;
                }
            }
        }
        return time;
    }
}
