class Solution {
    public void rotate(int[] nums, int k) {
        //brute- extra array temp
    // int n = nums.length;
    // int[] temp = new int[n];
    // for(int i = 0; i < n; i++) {
    //     temp[(i + k) % n] = nums[i];
    // }
    // for(int i = 0; i < n; i++) {
    //     nums[i] = temp[i];
    // }



    //better - cyclic replacement
    // int n = nums.length;
    // k = k % n;
    // int count = 0; // number of elements moved
    // for (int start = 0; count < n; start++) {
    //     int current = start;
    //     int prev = nums[start];
    //     do {
    //         int next = (current + k) % n;
    //         int temp = nums[next];
    //         nums[next] = prev;
    //         prev = temp;
    //         current = next;
    //         count++;
    //     } while (start != current);
    // }


    //Optimal-reversal algorithm
     int n=nums.length;
        k=k%n;
        rev(nums,0,n-1);
        rev(nums,0,k-1);
        rev(nums,k,n-1);
    }
    void rev(int[] nums,int start,int end){
        while(start<end){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;
            start++;
            end--;
        }
    }
}