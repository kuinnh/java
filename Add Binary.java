//二进制求和 https://leetcode.cn/problems/add-binary/description/

//给你两个二进制字符串 a 和 b ，以二进制字符串的形式返回它们的和。


class Solution {
    public String addBinary(String a, String b) {
        String anc = "";
        int c = 0;
        int sum = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || c > 0) {
            sum = c;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            anc = (sum % 2) + anc;
            c = sum / 2;
        }

        return anc;
    }
}