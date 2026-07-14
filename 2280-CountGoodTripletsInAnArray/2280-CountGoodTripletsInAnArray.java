// Last updated: 7/14/2026, 2:15:47 PM
class Solution {

    class Fenwick {
        long[] bit;
        int n;

        Fenwick(int n) {
            this.n = n;
            bit = new long[n + 1];
        }

        void update(int index, long val) {
            index++;
            while (index <= n) {
                bit[index] += val;
                index += index & -index;
            }
        }

        long query(int index) {
            index++;
            long sum = 0;

            while (index > 0) {
                sum += bit[index];
                index -= index & -index;
            }

            return sum;
        }
    }

    public long goodTriplets(int[] nums1, int[] nums2) {

        int n = nums1.length;

        int[] pos = new int[n];

        for (int i = 0; i < n; i++) {
            pos[nums2[i]] = i;
        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = pos[nums1[i]];
        }

        long[] left = new long[n];
        long[] right = new long[n];

        Fenwick bit1 = new Fenwick(n);

        for (int i = 0; i < n; i++) {
            left[i] = bit1.query(arr[i] - 1);
            bit1.update(arr[i], 1);
        }

        Fenwick bit2 = new Fenwick(n);

        for (int i = n - 1; i >= 0; i--) {
            long greater =
                    bit2.query(n - 1) - bit2.query(arr[i]);
            right[i] = greater;
            bit2.update(arr[i], 1);
        }

        long ans = 0;

        for (int i = 0; i < n; i++) {
            ans += left[i] * right[i];
        }

        return ans;
    }
}