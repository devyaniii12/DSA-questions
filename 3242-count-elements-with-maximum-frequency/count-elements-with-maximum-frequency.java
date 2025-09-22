class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int[] arr=new int[nums.length];
        int i=0;
        for(int n:map.values()){
            arr[i++]=n;
        }
        Arrays.sort(arr);
        int ans=0;
        int max=arr[nums.length-1];
        for(int k=0;k<arr.length;k++){
            if(arr[k]==max) ans+=max;
        }
        return ans;
}
}