class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> list=new ArrayList<>();
        if(nums1.length>=m){
            for(int i=0;i<m;i++){
            list.add(nums1[i]);
            }
        }
        if(nums2.length>=n){
            for(int j=0;j<n;j++){
            list.add(nums2[j]);
            }
        }
        Collections.sort(list);
        
        for(int i=0;i<list.size();i++){
            nums1[i]=list.get(i);
        }
    }
}