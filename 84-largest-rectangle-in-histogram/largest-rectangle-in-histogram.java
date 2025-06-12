class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        Stack<Integer> st=new Stack<>();
        int[] nse=new int[n];
        int[] pse=new int[n];

        //calculating next smaller element
        st.push(n-1);
        nse[n-1]=n;
        for(int i=n-2;i>=0;i--){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                nse[i]=n;
                st.push(i);
            }
            else{
                nse[i]=st.peek();
                st.push(i);
            }
            
        }
        //emptying the stack 
        while(!st.isEmpty()){
            st.pop();
        }

        //calculating the previous smaller element
        st.push(0);
        pse[0]=-1;
        for(int i=1;i<n;i++){
            while(!st.isEmpty() && heights[st.peek()]>=heights[i]){
                st.pop();
            }
            if(st.isEmpty()){
                pse[i]=-1;
                st.push(i);
            }
            else{
                pse[i]=st.peek();
                st.push(i);
            }
        }

        // finding maximum area of rectangle
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int area=heights[i]*(nse[i]-pse[i]-1);
            max=Math.max(area,max);
        }
        return max;
    }
}