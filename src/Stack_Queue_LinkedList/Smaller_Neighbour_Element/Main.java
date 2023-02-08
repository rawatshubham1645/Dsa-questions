package Stack_Queue_LinkedList.Smaller_Neighbour_Element;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        smallNeighbour(n,arr);
    }
    public static void smallNeighbour(int n, int[] arr){
        Stack<Integer> stack = new Stack<>();
        StringBuffer sf =new StringBuffer();
        
        for(int i = 0;i<n;i++){
            
            while(!stack.isEmpty() && stack.peek()>=arr[i] )stack.pop();
            if(stack.isEmpty())sf.append(-1+" ");
            else sf.append(stack.peek()+" ");
            stack.push(arr[i]);
        }
        System.out.println(sf);
    }
}