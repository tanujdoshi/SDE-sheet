class Solution {
    public void sortColors(int[] nums) {
        int zeros = 0, ones = 0 , twos = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0) {
                zeros += 1;
            } else if(nums[i] == 1){
                ones += 1;
            } else {
                twos += 1;
            }
        }
        int c = 0;
        while(zeros > 0){
            nums[c] = 0;
            c++;
            zeros--;
        }
        while(ones > 0){
            nums[c] = 1;
            c++;
            ones--;
        }
        while(twos > 0){
            nums[c] = 2;
            c++;
            twos--;
        }
    }
}