// Last updated: 7/14/2026, 2:15:55 PM
class Solution {
    public int search(int[] arr, int target) {
        Scanner sc = new Scanner(System.in);
           for(int i=0;i<arr.length;i++) {
            if(arr[i]==target) {
                return i;
            }
        }
        return -1;
    }
}