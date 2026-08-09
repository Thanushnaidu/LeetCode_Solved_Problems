class Solution {
    public int candy(int[] ratings) {
        int ans = ratings.length;
        int i = 1;
        while(i<ratings.length){
            if(ratings[i] == ratings[i-1]){
                i++;
                continue;
            }
            int peak = 0;
            while(i<ratings.length && ratings[i]>ratings[i-1]){
                peak++;
                ans = ans + peak;
                i++;
            }
            int valley = 0;
            while(i<ratings.length && ratings[i]<ratings[i-1]){
                valley++;
                ans = ans + valley;
                i++;
            }
            ans = ans - Math.min(peak,valley);
        }
        return ans;
    }
}