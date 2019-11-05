package containsDuplicate;

import java.util.Arrays;

/**
 * @program: interviewQuestion
 * @description: 包含重复
 * @author: jiangzq
 * @create: 2019-08-21 22:15
 **/
public class Solution_containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        /*
        //第一种方法
        HashSet<Integer> numbers = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            if(numbers.contains(nums[i])) return true;
            numbers.add(nums[i]);
        }
        return false;*/
        //第二种方法
        Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
}
