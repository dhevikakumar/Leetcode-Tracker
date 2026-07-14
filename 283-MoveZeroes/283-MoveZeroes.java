// Last updated: 7/14/2026, 2:16:04 PM
class Solution {
    public void moveZeroes(int[] arr) {

        int n = arr.length;

        for(int i = 0; i < n; i++) {

            if(arr[i] == 0) {

                for(int j = i + 1; j < n; j++) {

                    if(arr[j] != 0) {

                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;

                        break;
                    }
                }
            }
        }
    }
}

