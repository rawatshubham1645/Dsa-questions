package Evaluation_Problems.Class_for_sorting;

import java.util.*;
class sorter_class{
  // complete the class as mentioned in the problem statemenent above
  
 public void sort(String[] arr){
      Arrays.sort(arr);
  }
 public void sort(int[] arr){
      Arrays.sort(arr);
  }
  
 public void sort(char[] arr){
      Arrays.sort(arr);
  }
 public void sort(boolean[] arr){
      int count = 0;
      for(boolean i:arr){
          if(i==true)count++;
      }
      for(int i = 0;i<arr.length;i++){
          if(i<count)arr[i] = true;
          else arr[i] = false;
      }
  }
}
