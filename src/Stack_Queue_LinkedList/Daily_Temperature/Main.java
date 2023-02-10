package Stack_Queue_LinkedList.Daily_Temperature;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner scn=  new Scanner(System.in);
        int tc = scn.nextInt();
        for(int j= 0;j<tc;j++){
            int n = scn.nextInt();
            int[] arr = new int[n];
            for(int i = 0;i<n;i++){
                arr[i] = scn.nextInt();
            }
            dailyTemperature(n,arr);
        }
    }
    public static void dailyTemperature(int n, int[] arr){
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[n]; 
        StringBuffer sb = new StringBuffer();
        for(int i = n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[stack.peek()]<=arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = 0;
            }else {
                ans[i] = stack.peek()-i;
            }
            stack.push(i);
        }
        for(int i =0;i<n;i++){
            sb.append(ans[i]+" ");
        }
        // for(int i = n-1;i>=0;i--){
        //     sb.append(ans[i]+" ");
        // }
        System.out.println(sb);
    }
}
