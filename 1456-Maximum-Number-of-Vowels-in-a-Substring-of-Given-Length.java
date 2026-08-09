class Solution {
    public int maxVowels(String s, int k) {
        ArrayList<Integer> l = new ArrayList<>();
        ArrayList<Character> v = new ArrayList<>(Arrays.asList('a','e','i','o','u'));
        int ans = 0;
        for(int i=0;i<k;i++){
            if(v.contains(s.charAt(i))){
                l.add(i);
            }
        }
        ans = Math.max(l.size(),ans);
        for(int i=k;i<s.length();i++){
            if(l.contains(i-k)){
                l.remove(Integer.valueOf(i-k));
            }
            if(v.contains(s.charAt(i))){
                l.add(i);
            }
            ans = Math.max(l.size(),ans);
        }
        return ans;
    }
}