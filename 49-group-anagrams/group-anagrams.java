class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> mp=new HashMap<>();
        for(String word:strs){
            char[] ch=word.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if(!mp.containsKey(key)){
                mp.put(key, new ArrayList<>());
            }
            mp.get(key).add(word);
        }
        return new ArrayList<>(mp.values());

    }
}