class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> set=new HashSet<>();
        for(int i=0;i<brokenLetters.length();i++){
            set.add(brokenLetters.charAt(i));
        }
        String[] words=text.split(" ");
        int count=0;
        for(String word:words){
            boolean check=false;
            for(int i=0;i<word.length();i++){
                if(set.contains(word.charAt(i))) check=true;;
            }
            if(check==false) count++;

        }
        return count;

    }
}