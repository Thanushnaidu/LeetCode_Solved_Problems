class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return find(nums,goal) - find(nums,goal-1);
    }
    public static int find(int[] nums, int goal){
        if(goal <0){
            return 0;
        }
        int l = 0;
        int r = 0;
        int ans = 0;
        int sum = 0;
        while(r<nums.length){
            sum = sum + nums[r];
            while(sum>goal){
                sum = sum - nums[l];
                l++;
            }
            ans = ans + (r-l+1);
            r++;
        }
        return ans;
    }
}