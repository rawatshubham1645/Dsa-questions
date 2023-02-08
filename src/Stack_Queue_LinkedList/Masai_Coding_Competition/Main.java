package Stack_Queue_LinkedList.Masai_Coding_Competition;

import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        Queue<Integer> q3 = new LinkedList<>();
        Queue<Integer> q4 = new LinkedList<>();
        Queue<Integer> mq = new LinkedList<>();
        
        int n = sc.nextInt();
        for(int i = 0 ; i < n; i++){            
            String c = sc.next();
            if(c.charAt(0) == 'E'){
            int club= sc.nextInt();
            int roll = sc.nextInt();
            if(!mq.contains(club)){
                mq.add(club);
            }           
            if(club == 1) {
                q1.add(roll);                
            }
            else if(club == 2) {
                q2.add(roll);                
            }           
            else if(club == 3) {
                q3.add(roll);
            }
            else {
                q4.add(roll);   
            }
            }
            else{
                char ch = c.charAt(0);
                int front = mq.peek();
                if(front == 1){
                    System.out.println(1 + " " + q1.remove());
                    if(q1.isEmpty()){
                        mq.remove();
                    }
                }
                else if(front == 2){            
                    System.out.println(2 + " " + q2.remove());
                    if(q2.isEmpty()){
                        mq.remove();
                    }
                }
                else if(front == 3){                
                    System.out.println(3 + " " + q3.remove());
                    if(q3.isEmpty()){
                        mq.remove();
                    }
                }
                else {                    
                    System.out.println(4 + " " + q4.remove());
                    if(q4.isEmpty()){
                        mq.remove();
                    }
                }
            }
            
        }
  
        
        sc.close();
    }
}
