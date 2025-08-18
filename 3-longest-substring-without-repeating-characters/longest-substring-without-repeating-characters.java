class Solution {
    public int lengthOfLongestSubstring(String s) {
        //Brute- generate all substrings
    //     int n= s.length();
    //     int longMax=0;
    //     for(int i=0;i<n;i++){
    //         for(int j=i;j<n;j++){
    //             if(unique(s,i,j)) {
    //                 longMax=Math.max(longMax,j-i+1);
    //             }
    //         }
    //     }
    // return longMax;
    // }

    // boolean unique(String s,int i,int j){
    //     boolean[] c=new boolean[128];
    //     for(int k=i;k<=j;k++){
    //         char ch=s.charAt(k);
    //         if(c[ch]==true) return false;
    //         c[ch]=true;
    //     }
    //     return true;


    //Better-using set with bruteforce
    int longMax=0;
    for(int i=0;i<s.length();i++){
        Set<Character> set=new HashSet<>();
        int j=i;
        while(j<s.length() && !set.contains(s.charAt(j))){
            set.add(s.charAt(j));
            longMax=Math.max(longMax,j-i+1);
            j++;
        }
    }
    return longMax;
    }
}