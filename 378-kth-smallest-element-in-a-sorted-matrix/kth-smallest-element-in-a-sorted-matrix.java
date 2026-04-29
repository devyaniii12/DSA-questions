class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                arr.add(matrix[i][j]);  
            }
        }
        for(int i=0;i<k;i++){
            pq.add(arr.get(i));
        }
        for(int i=k;i<arr.size();i++){
            if(pq.peek()>arr.get(i)){
                pq.poll();
                pq.add(arr.get(i));
            }
        }
        return pq.peek();
    }
}