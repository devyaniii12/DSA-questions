class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans=new ArrayList<>();
        Map<String,List<String>> mp=new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String s=strs[i];
            char[] ch=s.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if(!mp.containsKey(key)){
                mp.putIfAbsent(key,new ArrayList<>());
            }
            if(mp.containsKey(key)){
                mp.get(key).add(s);
            }

        }
        return new ArrayList<>(mp.values());
    }
}