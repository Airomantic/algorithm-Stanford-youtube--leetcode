package TwoSum2_index;

import java.util.HashMap;

/**
 * @program: interviewQuestion
 * @description: Input array is sorted 输入数组已排序
 * @author: jiangzq
 * @create: 2019-08-24 16:50
 **/
public class Solution_index {
    public int[] twoSum(int[] numbers, int target) {
        /*
        //第一种方法
        int a_pointer = 0;
        int b_pointer = numbers.length - 1;

        while (a_pointer <= b_pointer) {
            int sum = numbers[a_pointer] + numbers[b_pointer];

            if (sum < target) {
                a_pointer += 1;
            } else if (sum > target) {
                b_pointer -= 1;
            } else {
                return new int[]{a_pointer + 1, b_pointer + 1};
            }
        }
        return new int[]{a_pointer + 1, b_pointer + 1};*/
        //第二种方法
        int[] result = new int[2];
        if (numbers == null || numbers.length == 0) {
            return result;
        }
        HashMap<Integer, Integer> visited = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (visited.containsKey(target - numbers[i])) {
                result[0] = visited.get(target - numbers[i]);
                result[1] = i;
                return result;
            }
            visited.put(numbers[i], i);
        }
        return result;
    }
}
