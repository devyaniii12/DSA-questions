class Solution {
    public int compareVersion(String version1, String version2) {
        String[] levels1 = version1.split("\\."); // Split by dot
        String[] levels2 = version2.split("\\.");

        int maxLength = Math.max(levels1.length, levels2.length);

        for (int i = 0; i < maxLength; i++) {
            // Get revision value, treating missing revisions as 0
            Integer v1 = (i < levels1.length) ? Integer.parseInt(levels1[i]) : 0;
            Integer v2 = (i < levels2.length) ? Integer.parseInt(levels2[i]) : 0;

            if (v1 < v2) {
                return -1;
            } else if (v1 > v2) {
                return 1;
            }
        }
        return 0; 
}
}