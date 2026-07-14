// Last updated: 7/14/2026, 2:16:19 PM
class Solution {
    public int singleNumber(int[] arr) {
        for(int i=0;i<arr.length;i++) {
            int count = 0;
            for(int j=0;j<arr.length;j++) {
                if(arr[i]==arr[j]) {
                    count++;
                }
            }
                 if(count == 1) {
                     return arr[i];
            }
        } 
         
                return -1 ;
    }
}