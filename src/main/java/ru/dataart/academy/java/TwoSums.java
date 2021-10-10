package ru.dataart.academy.java;

public class TwoSums {
    /**
     * @param nums   - sorted in ascending order array of integer values >=0
     * @param target - integer value >= 0
     * @return - array of two numbers from nums which sum equals to target
     * Example: nums = [1, 4, 6, 7, 10], target = 10
     * Result - [4, 6]
     * Example: nums = [1, 4, 6, 7, 10], target = 2
     * Result - []
     */
    public int[] getTwoSum(int[] nums, int target) {
        int first = 0, second = 0;
        int start = 0, end = nums.length - 1;
        while(start < end) {
            if (nums[start] + nums[end] > target)
                end--;
            else if (nums[start] + nums[end] < target)
                start++;
            else {
                first = nums[start];
                second = nums[end];
                break;
            }
        }
        if (start >= end)
            return new int[]{};
        return new int[]{first, second};
    }
}
