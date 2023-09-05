class Solution {
    public int findPeakElement(int[] nums) {
        int max = nums[0];
        int maxInd = 0;
        int n = nums.length;
        int s = 0, e = n - 1;
        if(n == 1)
        return 0;
        while(s < e) {
            if(nums[s] <= nums[e]) {
                if(nums[e] >= max) {
                    max = nums[e];
                    maxInd = e;
                }
                s++;
            }
            else{
                if(nums[s] >= max) {
                    max = nums[s];
                    maxInd = s;
                }
                e--;
            }
        }

        return maxInd;
    }
}