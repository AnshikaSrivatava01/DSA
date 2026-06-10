class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean t = false;
        int l = nums.length;
        for(int i=0; i<l; i++){
            for(int j=0; j<l; j++){
                if((i != j)&&(nums[i] == nums[j])){
                    return true;
                }
            }
        }
        return false;
    }
}