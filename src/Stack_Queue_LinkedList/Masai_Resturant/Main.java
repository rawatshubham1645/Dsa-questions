package Stack_Queue_LinkedList.Masai_Resturant;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int tc = scn.nextInt();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0;i<tc;i++){
            int query = scn.nextInt();
            if(query==1){
                if(stack.isEmpty()){
                    System.out.println("No Food");
                }else{
                    System.out.println(stack.pop());
                }
            }else {
                int cost = scn.nextInt();
                stack.push(cost);
            }
        }
    }
}
