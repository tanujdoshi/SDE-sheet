class Solution {

    
    public void nextPermutation(int[] nums) {
        int index = -1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                index = i;
                break;
            }
        }

        System.out.println("Index " + index);

        if(index == -1) {
            for (int i = 0; i < n / 2; i++) {
                int temp = nums[i];
                nums[i] = nums[n - 1 - i];
                nums[n - 1 - i] = temp;
            }            
        } else {
            for(int i=n-1;i>index;i--){
                if(nums[i] > nums[index]) {
                    int tem = nums[i];
                    nums[i] = nums[index];
                    nums[index] = tem;
                    break;
                }
            }

            //taking array and sort the rest of it : 
            int[] subarray = Arrays.copyOfRange(nums, index+1, n);
            Arrays.sort(subarray);
            System.arraycopy(subarray, 0, nums, index+1, subarray.length);
        }   

    }
}