class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //Better - HashMap+Sorting T.C=O(N.klog(k)) S.C=O(N)
        // List<List<String>> ans=new ArrayList<>();
        // Map<String,List<String>> mp=new HashMap<>();
        // for(int i=0;i<strs.length;i++){
        //     String s=strs[i];
        //     char[] ch=s.toCharArray();
        //     Arrays.sort(ch);
        //     String key=new String(ch);
        //     if(!mp.containsKey(key)){
        //         mp.putIfAbsent(key,new ArrayList<>());
        //     }
        //     if(mp.containsKey(key)){
        //         mp.get(key).add(s);
        //     }

        // }
        // return new ArrayList<>(mp.values());



        //Best- HashMap + Frequency Count (No Sorting) T.c=O(N) S.C=O(N)
        Map<String,List<String>> mp=new HashMap<>();
        for(String s :strs){
            int[] charc=new int[26];
            for(char c:s.toCharArray()){
                charc[c-'a']++;
            }
        StringBuilder sb=new StringBuilder();
        for(int count:charc){
            sb.append('#').append(count);
        }
        String key=sb.toString();
        mp.putIfAbsent(key,new ArrayList<>());
        mp.get(key).add(s);
    }
    return new ArrayList<>(mp.values());
}
}