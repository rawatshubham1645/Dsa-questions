package Stack_Queue_LinkedList.Nearest_Neighbour_Element;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        smallerNeighbourElement(n, arr);
    }
    public static void smallerNeighbourElement(int n, int[] arr){
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0;i<n;i++){
            while(!stack.isEmpty() && stack.peek()>=arr[i]){
                    stack.pop();
                }
            if(stack.isEmpty()){
                sb.append(-1+" ");
            }else {
                
                sb.append(stack.peek()+" ");
            }
            
            stack.push(arr[i]);
        }
        System.out.println(sb);
    }
}