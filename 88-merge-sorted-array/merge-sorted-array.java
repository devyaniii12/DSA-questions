class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0,j=0,k=0;
        int maxSize=Math.max(nums1.length,nums2.length);
        int[] ans=new int[maxSize];
        while(i<m && j<n){
            if(nums1[i]>nums2[j]){
                ans[k++]=nums2[j++];
            }
            else{
                ans[k++]=nums1[i++];
            }
        }
        while(i<m){
            ans[k++]=nums1[i++];
        }
        while(j<n){
            ans[k++]=nums2[j++];
        }
        for(int s=0;s<maxSize;s++){
            nums1[s]=ans[s];
        }
    }
}