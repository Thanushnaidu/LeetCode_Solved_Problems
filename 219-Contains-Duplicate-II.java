class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!hm.containsKey(nums[i])){
                hm.put(nums[i],i);
            }
            else{
                if(Math.abs(i-hm.get(nums[i]))>k){
                    hm.put(nums[i],i);
                }
                else{
                    return true;
                }
            }
            
        }
        return false;
    }
}