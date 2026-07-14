// Last updated: 7/14/2026, 2:16:26 PM
class Solution {
    public String multiply(String num1, String num2) {

        int[] arr = new int[num1.length() + num2.length()];

        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {

                int n1 = num1.charAt(i) - '0';
                int n2 = num2.charAt(j) - '0';

                int product = n1 * n2;

                int sum = product + arr[i + j + 1];

                arr[i + j + 1] = sum % 10;
                arr[i + j] += sum / 10;
            }
        }

        String ans = "";

        for (int num : arr) {
            if (!(ans.length() == 0 && num == 0)) {
                ans += num;
            }
        }

        return ans.length() == 0 ? "0" : ans;
    }
}