package cn.study.practice.algorithm010;

//给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
//
// 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
//
//
//
// 示例:
//
// 给定 nums = [2, 7, 11, 15], target = 9
//
//因为 nums[0] + nums[1] = 2 + 7 = 9
//所以返回 [0, 1]
//
// Related Topics 数组 哈希表


import java.util.HashMap;
import java.util.Map;

//leetcode submit region begin(Prohibit modification and deletion)
class TwoSum {

    /**
     * 方法一：双层循环
     * 时间复杂度：O(n^2)
     * 空间复杂度：O(1)
     */
    public int[] twoSum01(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target == nums[i] + nums[j]) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("no two num sum equals target");
    }

    /**
     * 方法二：两遍Hash表
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public int[] twoSum02(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(nums[i])};
            }
        }
        throw new IllegalArgumentException("no two num sum equals target");
    }

    /**
     * 方法三：一遍Hash表
     * 时间复杂度：O(n)
     * 空间复杂度：O(n)
     */
    public int[] twoSum03(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int temp = target - nums[i];
            if (map.containsKey(temp)) {
                return new int[]{i, map.get(temp)};
            } else {
                map.put(nums[i], i);
            }
        }
        throw new IllegalArgumentException("no two num sum equals target");
    }
}
//leetcode submit region end(Prohibit modification and deletion)
