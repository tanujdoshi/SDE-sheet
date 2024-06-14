class Solution {
    public int maxSubArray(int[] nums) {

        if(nums.length == 1){
            return nums[0];
        }

        if(nums.length == 2){
            int max_1 = Math.max(nums[0], nums[1]);
            return Math.max(max_1, nums[0] + nums[1]);
        }

        int sumTillNow = nums[0];
        int sum = nums[0];
        for(int i=1;i<nums.length;i++){
            int temp = sumTillNow + nums[i];
            
            if(temp > nums[i]) {
                sumTillNow = temp;
                
            } else {
                sumTillNow = nums[i]; 
            }

            if(sumTillNow > sum) {
                sum = sumTillNow; 
            }
        }
        return sum;
    }
}