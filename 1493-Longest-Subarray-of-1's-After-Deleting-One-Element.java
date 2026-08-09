class Solution {
    public int longestSubarray(int[] nums) {
        int c = 0;
        int ans = 0;
        int l = 0;
        int r = 0;
        int oc = 0;
        while(r<nums.length){
            if(nums[r] == 0){
                c++;
            }
            else{
                oc++;
            }
            while(c>1){
                if(nums[l] == 0){
                    c--;
                }
                l++;
            }
            ans = Math.max(ans,(r-l));
            r++;
        }
        if(oc == 0){
            return 0;
        }
        if(ans == 0){
            return nums.length-1;
        }
        return ans;
    }
}