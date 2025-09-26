class Solution {
    public int compress(char[] chars) {
        int i = 0, index = 0; // i = read pointer, index = write pointer
        
        while (i < chars.length) {
            char c = chars[i];
            int count = 0;
            
            // count consecutive same characters
            while (i < chars.length && chars[i] == c) {
                i++;
                count++;
            }
            
            // write the character
            chars[index++] = c;
            
            // write the count if > 1
            if (count > 1) {
                for (char ch : String.valueOf(count).toCharArray()) {
                    chars[index++] = ch;
                }
            }
        }
        
        return index;
    }
}
