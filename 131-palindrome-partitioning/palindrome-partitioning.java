class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> res=new ArrayList<>();
        List<String> palindromeString=new ArrayList<>();
        helperFunction(0,s,palindromeString,res);
        return res;
    }
    public void helperFunction(int index,String s,List<String> palindromeString,List<List<String>> res){
        if(index==s.length()){
            res.add(new ArrayList<>(palindromeString));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(Palindrome(index,i,s)){
                palindromeString.add(s.substring(index,i+1));
                helperFunction(i+1,s,palindromeString,res);
                palindromeString.remove(palindromeString.size()-1);
            }
        }
    }

    public boolean Palindrome(int a,int b,String s){
        while(a<b){
            if(s.charAt(a)!=s.charAt(b)){
                return false;
            }
            a++;
            b--;
           
        }
         return true; 
    }    
    
}