class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //brute
        // Set<List<Integer>> s=new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     for(int j=i+1;j<nums.length;j++){
        //         for(int k=j+1;k<nums.length;k++){
        //             if(nums[i]+nums[j]+nums[k]==0){
        //                 int[] triplet= new int[]{nums[i],nums[j],nums[k]};
        //                 Arrays.sort(triplet);
        //                 s.add(Arrays.asList(triplet[0],triplet[1],triplet[2]));
        //             }
        //         }
        //     }
        // }
        // return new ArrayList<>(s);




        //Better Approach -  HashSet
        // Set<List<Integer>> s=new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        // Set<Integer> set=new HashSet<>();
        // for(int j=i+1;j<nums.length;j++){
        //      int third=-nums[i]-nums[j];
        //     if(set.contains(third)){
        //         int temp[]={nums[i],nums[j],third};
        //         Arrays.sort(temp);
        //         s.add(Arrays.asList(temp[0],temp[1],temp[2]));
        //     }
        //     set.add(nums[j]);
        // }
        // }
        // return new ArrayList<>(s);





        //Best - 2 pointers
        Arrays.sort(nums);
        List<List<Integer>> ans =new ArrayList<>();
        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]) continue;
            int left=i+1;
            int right=nums.length-1;
            while(left<right){
                int sum=nums[i]+nums[left]+nums[right];
                if(sum==0){
                    ans.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left<right && nums[left]==nums[left+1]) left++;
                    while(left<right && nums[right]==nums[right-1]) right--;
                left++;
                right--;
                }
                else if(sum<0){
                    left++;
                }
                else{
                    right--;
                }
            }
        }
        return ans;

    }
}