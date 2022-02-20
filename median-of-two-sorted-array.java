class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
          int[] arr = new int[nums1.length + nums2.length]; 
        int j = 0;
        for(; j<nums1.length; j++){
            arr[j] = nums1[j];
            
        }
         for(int i = 0; i<nums2.length; j++, i++){
            arr[j] = nums2[i];
        }
       
        Arrays.sort(arr);
        if(arr.length%2==1){
            int i = ( arr.length-1)/2;
            double val  = arr[i];
            return val;
        }
        else{
            int i = (arr.length-1)/2;
            double val = (arr[i] + arr[i+1])/2;
            return val;
        }
    }
}
