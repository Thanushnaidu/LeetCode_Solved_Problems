class Solution {
    public int equalPairs(int[][] grid) {
        HashMap<ArrayList<Integer>,Integer> hm = new HashMap<>();
        for(int i=0;i<grid.length;i++){
            ArrayList<Integer> l = new ArrayList<>();
            for(int j=0;j<grid.length;j++){
                l.add(grid[i][j]);
            }
            hm.put(l,hm.getOrDefault(l,0)+1);
        }
        int ans = 0;
        for(int i=0;i<grid.length;i++){
            ArrayList<Integer> l = new ArrayList<>();
            for(int j=0;j<grid.length;j++){
                l.add(grid[j][i]);
            }
            if(hm.containsKey(l)){
                ans = ans + hm.get(l);
            }
        }
        return ans;
    }
}