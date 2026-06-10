class Solution {
    public int[] twoSum(int[] nums, int target) {
        int sum = 0;
        int[] index = new int[2];
        for(int i  =0; i<nums.length; i++){
            for(int j=1; j<nums.length; j++){
                sum = nums[i] + nums[j];
                if((i != j) && (sum == target)){
                   index[0] = i;
                   index[1] = j;  
                   Arrays.sort(index);
                }
            }
        }
        return index;
    }
}
