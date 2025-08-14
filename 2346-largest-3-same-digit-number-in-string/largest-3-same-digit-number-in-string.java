class Solution {
    public String largestGoodInteger(String num) {
        String s="";
        int j=0;
        char ch1=num.charAt(0);
        if(num.length()==3){
            if(num.charAt(j+1)==ch1 && num.charAt(j+2)==ch1){
                 s=num.substring(j,j+3);
                return s;
            }
        }
        for(int i=0;i<=num.length()-3;i++){
            char ch=num.charAt(i);
            if(num.charAt(i+1)==ch && num.charAt(i+2)==ch){
                String temp=num.substring(i,i+3);
                if(s.isEmpty() || temp.compareTo(s)>0){
                    s=temp;
                }
            }
        }
        return s;
    }
}