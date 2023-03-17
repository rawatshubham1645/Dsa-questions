package Evaluation_Problems.Intersection_of_Two_Linked_List;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//       //First calculate the length of both LinkedList
//       //Then Subtract the longer list to shorter list to get the same length
//       //So that we can start with the same 1 element 
//       int l1 = 0;
//       ListNode temp1 = headA;
//       while(temp1 != null){
//           l1++;
//           temp1 =temp1.next; 
//       }
//        int l2 = 0;
//       ListNode temp2 = headB;
//       while(temp2 != null){
//           l2++;
//           temp2 =temp2.next; 
//       }
//       temp1 = headA;
//       temp2 = headB;
//    int val = 0;
//    if(l1>l2){
//        val = l1-l2;
//        
//    while(val>0){
//        temp1 = temp1.next;
//        val--;
//    }
//    }else{
//        val = l2-l1;
//        
//        while(val>0){
//            temp2 = temp2.next;
//            val--;
//        }
//    }
//    
//    while(temp1!=null){
//        if(temp1==temp2){
//            return temp1;
//        }
//        temp1 = temp1.next;
//        temp2 = temp2.next;
//    }
//    return null;
//
//
//    }
}
