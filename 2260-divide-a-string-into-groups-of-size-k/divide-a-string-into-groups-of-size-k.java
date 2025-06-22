class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n=(int)Math.ceil((double)s.length() / k);
        String[] str=new String[n];
        int m=0;
        for(int i=0;i<s.length();i=i+k){
            String c="";
            for(int j=i;j< i+k;j++){
                if(j < s.length()) {
                    c += s.charAt(j);
                } else {
                    c += fill;
                }
            }
            str[m]=c;
            m++;
        }
        return str;
    }
}