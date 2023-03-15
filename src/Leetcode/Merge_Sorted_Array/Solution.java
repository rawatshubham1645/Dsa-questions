package Leetcode.Merge_Sorted_Array;

class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = 0;
        int r = 0;
        int[] arr = new int[nums1.length];
        int k = 0;
        while(l<m && r <n){
            if(nums1[l]<nums2[r]){
               arr[k++]=  nums1[l++];
            }else{
                arr[k++]=  nums2[r++];
            }
        }
        while(l<m){
            arr[k++]=  nums1[l++];
        }
        while(r<n){
            arr[k++]=  nums2[r++];
        }
        for(int i = 0;i<m+n;i++){
            nums1[i] = arr[i];
        }
    }
}
