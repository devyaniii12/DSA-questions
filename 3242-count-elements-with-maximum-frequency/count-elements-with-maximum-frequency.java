class Solution {
    public int maxFrequencyElements(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int[] arr=new int[map.size()];
        int i=0;
        for(int n:map.values()){
            arr[i++]=n;
        }
        int ans=0;
        int max=arr[0];
        for(int j=1;j<arr.length;j++){
            if(arr[j]>max){
                max=arr[j];
        }
        }
        for(int k=0;k<arr.length;k++){
            if(arr[k]==max) ans+=max;
        }
        return ans;
}
}