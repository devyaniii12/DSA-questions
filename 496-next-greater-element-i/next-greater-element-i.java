class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans = new int[nums1.length];
        Stack<Integer> st = new Stack<>();
        Map<Integer, Integer> nextGreaterMap = new HashMap<>();
         
        for(int i=0;i<nums2.length;i++){
            while(!st.isEmpty() && st.peek()<nums2[i]){
                nextGreaterMap.put(st.pop(),nums2[i]);
            }
            st.push(nums2[i]);
        }

        for(int i=0;i<nums1.length;i++){
            ans[i]=nextGreaterMap.getOrDefault(nums1[i],-1);
        }

        return ans;
    }}