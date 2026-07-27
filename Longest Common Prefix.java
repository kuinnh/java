//14. 最长公共前缀 https://leetcode.cn/problems/longest-common-prefix/description/

//编写一个函数来查找字符串数组中的最长公共前缀。
//如果不存在公共前缀，返回空字符串 ""。

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String st = "";

        if (strs == null || strs.length == 0) return st;
        int minLen = strs[0].length();

        for (String s : strs) {
            if (s.length() < minLen) {
                minLen = s.length();
            }
        }

        int i = 0;
        while (i < minLen) {
            boolean flag = true;
            for (int i1 = 0; i1 < strs.length - 1; i1++) {
                if (!strs[i1].substring(i, i + 1).equals(strs[i1 + 1].substring(i, i + 1))) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                st += strs[0].substring(i, i + 1);
                i++;
            } else {
                break;
            }
        }

        return st;
    }
}
