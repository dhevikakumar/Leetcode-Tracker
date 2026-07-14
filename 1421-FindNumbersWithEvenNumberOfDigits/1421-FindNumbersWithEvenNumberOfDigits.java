// Last updated: 7/14/2026, 2:15:52 PM
class Solution {
    public int findNumbers(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++) {
            int num = nums[i];
            int dig = 0;
            while(num>0) {
                dig++;
                num = num / 10;
            }
            if(dig%2==0) {
                count++;
            }
        }
        return count;
    }
}