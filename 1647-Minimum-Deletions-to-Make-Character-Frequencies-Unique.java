class Solution {
    public int minDeletions(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char ch:s.toCharArray()){
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        ArrayList<Integer> l = new ArrayList<>();
        int ans = 0;
        for(Integer k:hm.values()){
            int b = k;
            while(b>0 && l.contains(b)){
                b--;
                ans++;
            }
            if(b>0){
                l.add(b);
            }
        }
        return ans;
    }
}