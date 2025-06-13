class Solution {
    public int majorityElement(int[] nums) {
        int freq=0;
        int number=0;
        for(int i=0;i<nums.length;i++){
            if(freq==0){
                number=nums[i];
            }
            if(nums[i]==number){
                freq++;
            }
            else{
                freq--;
            }
        }
        return number;
    }
        
    }
