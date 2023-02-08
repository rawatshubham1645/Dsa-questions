package Stack_Queue_LinkedList.UniqueGift;

import java.util.*;
public class Main{
    public static void main(String... args){
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while(tc-- != 0){
            String str = sc.next();
            
            String ans = "";
            Queue<Character> q = new LinkedList<>();
            Map<Character,Integer> map = new HashMap<>();
            for(int i = 0; i < str.length(); i++){
                q.add(str.charAt(i));
                if(!map.containsKey(str.charAt(i))){
                    map.put(str.charAt(i),1);
                }
                else{
                    int val = map.get(str.charAt(i))+1;
                    map.put(str.charAt(i), val);
                }
                while(!q.isEmpty()){
                    if(map.get(q.peek()) == 1){
                        break;
                    }
                    else{
                        q.remove();
                    }
                }
                if(q.isEmpty()){
                    ans += "#";
                }
                else {
                    ans += q.peek();
                }
                
            }System.out.println(ans);
        }
        sc.close();
    }
}
