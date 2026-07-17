//找出字符串中第一个匹配项的下标 https://leetcode.cn/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

//给你两个字符串 haystack 和 needle ，
// 请你在 haystack 字符串中找出 needle 字符串的第一个匹配项的下标（下标从 0 开始）。
// 如果 needle 不是 haystack 的一部分，则返回  -1 。


class Solution {
    public int strStr(String haystack, String needle) {
        if (needle.length() > haystack.length()) {
            return -1;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            String all = haystack.substring(i, i + needle.length());
            if (all.equals(needle)) {
                return i;
            }
        }

        return -1;
    }
}