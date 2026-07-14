// Last updated: 7/14/2026, 2:16:06 PM
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int totsum = n*(n+1)/2;
        int orisum = 0;
        for(int i=0;i<n;i++) {
            orisum = orisum + nums[i];
        }
        int res = totsum - orisum;
        return res;
    }
}