class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] output = new int[n-k+1];
        Stack<Integer> st=new Stack<>();
        //next greater element
        int[] nge=new int[n];
        st.push(n-1);
        nge[n-1]=n;
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && nums[i]>nums[st.peek()])st.pop();
            if(st.isEmpty()){
                nge[i]=n;
            }
            else{
                nge[i]=st.peek();
            }
            st.push(i);
            }
        int j=0;
        int z=0;
        for(int i=0;i<n-k+1;i++){
            if(j>=i+k) j=i;
            int max=nums[j];
            while(j<i+k){
                max=nums[j];
                j=nge[j];
            }
            output[z++]=max;
        }
        return output;
        }
        
    }
