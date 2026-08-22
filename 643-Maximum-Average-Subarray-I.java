class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int sum = 0;
        for(int i=0;i<k;i++){
            sum = sum +  nums[i];
        }
        int ans = sum;
        for(int i=k;i<nums.length;i++){
            sum = sum - nums[i-k];
            sum = sum +nums[i];
            ans = Math.max(sum,ans);
        }
        return (double)ans /k;

    }
}