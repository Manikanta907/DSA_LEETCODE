class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
        int[] merged=new int[m+n];
 
        for(int i=0;i<m;i++){
            merged[i]=nums1[i];
        }
        for(int i=0;i<n;i++){
            merged[m+i]=nums2[i];
        }
        java.util.Arrays.sort(merged);
        int len = m+n;
        if(len%2==1){
            return merged[len/2];
        }
        else{
            return (merged[len/2-1]+merged[len/2])/2.0;
        }

        
    
    }
}