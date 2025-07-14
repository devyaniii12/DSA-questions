class Solution {
    public int maximalRectangle(char[][] matrix) {
        if(matrix.length==0) return 0;
        int rows=matrix.length;
        int cols=matrix[0].length;
        int[] ans=new int[cols];
        int mx=0;;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(matrix[i][j]=='1') ans[j]+=1;
                else ans[j]=0;
            }
            mx=Math.max(mx,MAH(ans));
        }
        return mx;
    }
    int MAH(int[] arr){
        // next smaller to left
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        int[] nsl=new int[n];
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
               st.pop();
            }
            if(st.isEmpty()) nsl[i]=-1;
            else if(!st.isEmpty() && arr[i]>arr[st.peek()]) nsl[i]=st.peek();
            st.push(i);
        }
        st.clear();
        // next smaller to right
        int[] nsr=new int[n];
        for(int i=n-1;i>=0;i--){
            while(!st.isEmpty() && arr[i]<=arr[st.peek()]){
               st.pop();
            }
            if(st.isEmpty()) nsr[i]=n;
            else if(!st.isEmpty() && arr[i]>arr[st.peek()]) nsr[i]=st.peek();
            st.push(i);
        }

        //area
        int area=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            area=Math.max(area,arr[i]*(nsr[i]-nsl[i]-1)); 
        }
        return area;

    }
}