class Solution {
    public boolean reorderedPowerOf2(int n) {
        String sortedN = sortDigits(n);
        for (int i = 1; i <= 1_000_000_000; i <<= 1) {
            if (sortedN.equals(sortDigits(i))) {
                return true;
            }
        }
        return false;
    }
    private String sortDigits(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        java.util.Arrays.sort(arr);
        return new String(arr);
    }
}