class Solution {
    public int[] getAverages(int[] nums, int k) {
        int[] ans = new int[nums.length];
        if(k == 0){
            return nums;
        }
        if(nums.length<(2 * k + 1)){
            Arrays.fill(ans,-1);
            return ans;
        }
        int ct = k;
        for(int i=0;i<k &&i<nums.length;i++){
            ans[i] = -1;
        }
        for(int i=nums.length-1;i>(nums.length-1)-k && i>=0;i--){
            ans[i] = -1;
        }
        int y = (2*k)+1;
        long sum = 0;
        for(int i=0;i<y;i++){
            sum = sum + nums[i];
        }
        if(ct>0 && ct<nums.length){
            ans[ct] = (int)(sum/y);
            ct++;
        }
        for(int i=y;i<nums.length;i++){
            sum = sum - nums[i-y];
            sum = sum + nums[i];
            if(ct>0 && ct<nums.length){
                ans[ct] = (int)(sum/y);
                ct++;
            }
        }
        return ans;
    }
}