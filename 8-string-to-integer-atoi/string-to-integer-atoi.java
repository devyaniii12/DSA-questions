class Solution {
    public int myAtoi(String s) {
        //Brute- using inbuilt functions
        // s = s.trim();
        // if (s.isEmpty()) return 0;

        // try {
        //     return Integer.parseInt(s);
        // } catch (NumberFormatException e) {
        //     if (s.charAt(0) == '-') return Integer.MIN_VALUE;
        //     else return Integer.MAX_VALUE;
        // }


        //Better
        // int i = 0, n = s.length();
        // // 1. Skip leading whitespaces
        // while (i < n && s.charAt(i) == ' ') i++;

        // // 2. Handle sign
        // int sign = 1;
        // if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
        //     sign = (s.charAt(i) == '-') ? -1 : 1;
        //     i++;
        // }

        // // 3. Convert digits
        // long result = 0;
        // while (i < n && Character.isDigit(s.charAt(i))) {
        //     result = result * 10 + (s.charAt(i) - '0');

        //     // 4. Overflow check
        //     if (sign == 1 && result > Integer.MAX_VALUE) return Integer.MAX_VALUE;
        //     if (sign == -1 && -result < Integer.MIN_VALUE) return Integer.MIN_VALUE;

        //     i++;
        // }

        // return (int)(sign * result);



        //Optimal-
        int i = 0, n = s.length();
        while (i < n && s.charAt(i) == ' ') i++;

        int sign = 1;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        int result = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';

            // Overflow check before adding digit
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;

  
    }
}