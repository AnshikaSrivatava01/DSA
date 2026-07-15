class Solution {
    public int majorityElement(int[] nums) {
        int res = 0 ;
        int n = nums.length;
        for(int i = 0; i < n ; i++){
            int cnt = 0 ;
            for(int j = i ; j< n; j++){
                if(nums[i] == nums[j])
                cnt++;
            }
            if(cnt > n/2){
                res = nums[i];
            }
        }
        return res;
    }
}