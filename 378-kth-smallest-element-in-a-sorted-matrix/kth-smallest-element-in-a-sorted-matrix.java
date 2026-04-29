class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        List<Integer> arr=new ArrayList<>();
        int m=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                arr.add(matrix[i][j]);
                m++;
            }
        }
        Collections.sort(arr);
        return arr.get(k-1);
    }
}