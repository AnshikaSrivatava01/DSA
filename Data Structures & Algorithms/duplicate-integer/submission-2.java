
class Solution {
    public boolean hasDuplicate(int[] nums) {
        int l = nums.length;
        HashSet<Integer> d = new HashSet<>();
        for(int i=0; i<l; i++){
           d.add(nums[i]);
        }
        if( l == d.size()){
            return false;
        }
        return true;
    }
}