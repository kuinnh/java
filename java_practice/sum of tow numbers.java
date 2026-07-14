//两数之和 https://leetcode.cn/problems/two-sum/description/

//给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
//
//你可以假设每种输入只会对应一个答案，并且你不能使用两次相同的元素。
//
//你可以按任意顺序返回答案

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int slow = 0, fast = 1;
        while(nums[slow] + nums[fast] != target){
            if (fast == nums.length - 1){
                slow++;
                fast = slow + 1;
            }else{
                fast++;
            }
        }
        if (slow < nums.length && fast < nums.length) {
            return new int[]{slow, fast};
        }
        return new int[]{};
    }
}
