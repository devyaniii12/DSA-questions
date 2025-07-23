class Solution {
    public int maximumGain(String s, int x, int y) {
        if (x > y) {
            return process(s, "ab", x, "ba", y);
        } else {
            return process(s, "ba", y, "ab", x);
        }
    }

    private int process(String s, String firstPair, int firstScore, String secondPair, int secondScore) {
        StringBuilder firstPass = new StringBuilder();
        int score = 0;
        for (char ch : s.toCharArray()) {
            firstPass.append(ch);
            int len = firstPass.length();
            if (len >= 2 && firstPass.charAt(len - 2) == firstPair.charAt(0)
                    && firstPass.charAt(len - 1) == firstPair.charAt(1)) {
                firstPass.delete(len - 2, len);  
                score += firstScore;
            }
        }
        StringBuilder secondPass = new StringBuilder();
        for (int i = 0; i < firstPass.length(); i++) {
            secondPass.append(firstPass.charAt(i));
            int len = secondPass.length();
            if (len >= 2 && secondPass.charAt(len - 2) == secondPair.charAt(0)
                    && secondPass.charAt(len - 1) == secondPair.charAt(1)) {
                secondPass.delete(len - 2, len);  
                score += secondScore;
            }
        }

        return score;
    }
}