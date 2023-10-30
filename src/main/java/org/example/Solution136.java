package org.example;

/**
 * Single Number
 */
public class Solution136 {
    public int singleNumber(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int result = 0;
        for(int num: nums) {
            result ^= num;
        }
        return result;
    }
}
