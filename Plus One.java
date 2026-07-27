//66.加一 https://leetcode.cn/problems/plus-one/description/

//给定一个表示 大整数 的整数数组 digits，其中 digits[i] 是整数的第 i 位数字。
// 这些数字按从左到右，从最高位到最低位排列。这个大整数不包含任何前导 0。
//将大整数加 1，并返回结果的数字数组。

class Solution {
    public int[] plusOne(int[] digits) {
        int Carry = 0;

        for (int j = digits.length - 1; j >= 0; j--) {
            if (digits[j] == 9) {
                digits[j] = 0;
                Carry = 1;
            } else {
                digits[j] += 1;
                Carry = 0;
                break;
            }
        }

        // 如果最后还需要进位（即全9的情况）
        if (Carry == 1) {
            digits = new int[digits.length + 1];
            digits[0] = 1;
        }

        return digits;
    }
}