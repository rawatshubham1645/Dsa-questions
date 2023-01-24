package Masai.Find_the_pivot_index;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] arg){
	    Scanner scn = new Scanner(System.in);
	    int n = scn.nextInt();
	        ArrayList<Integer> list = new ArrayList<>();
	    
	    for(int i = 0;i<n;i++){
	        list.add(scn.nextInt()) ;
	    }

	   int a =  equilibrium(list);
	   System.out.println(a);
	    
	    }
	    public static int equilibrium(ArrayList<Integer> list){
	        // System.out.println(list);
	        int left = 0;
	        int right = 0;
	         for(int x: list){
	            right+=x;
	        }
	        // System.out.println(right);
	        for(int i = 0;i<list.size();i++){
	            right -= list.get(i);
	            if(right==left)return i+1;
	            left += list.get(i);
	            
	              
	            
	        }
	        return -1;
	    }
}
