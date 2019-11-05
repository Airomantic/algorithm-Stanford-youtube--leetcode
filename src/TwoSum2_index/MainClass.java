package TwoSum2_index;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @program: interviewQuestion
 * @description: 主函数类
 * @author: jiangzq
 * @create: 2019-08-24 15:06
 **/
public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;

        while ((line = in.readLine()) != null) {
            int[] numbers = stringToIntegerArray(line);//字符串转整型数组，即输入的字符串包含“[”，“,”和数字需要用整型数字来表示
            line = in.readLine();
            int target = Integer.parseInt(line);//这里面的字符串Line只会取出数字来进行字符串转整型单个值
            int[] ret = new Solution_index().twoSum(numbers, target);
            String out = IntegerArrayToString(ret);
            System.out.println(out);
        }
    }

    private static String IntegerArrayToString(int[] nums) {
        return integerArrayToString(nums, nums.length);
    }

    private static String integerArrayToString(int[] nums, int length) {
        if (length == 0) {
            return "[]";
        }
        String result = "";
        for (int index = 0; index < length; index++) {
            int number = nums[index];
            result += Integer.toString(number)+",";
        }
        return "[" + result.substring(0, result.length() - 1) + "]";//输出的第二个值是result.length()-1，后面这个减1是未来得到当前数result[result.length()-1]
    }

    public static int[] stringToIntegerArray(String input) {
        input = input.trim();//trim()的作用是去掉字符串两端的多余的空格，注意，是两端的空格，且无论两端的空格有多少个都会去掉，当然中间的那些空格不会被去掉
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }
        String[] parts = input.split(",");//将一个字符串分割为子字符串，然后将结果作为字符串数组返回，去除","
        int[] output = new int[parts.length];
        for (int index = 0; index < parts.length; index++) {
            String part =parts[index].trim();//再继续对其修剪
            output[index] = Integer.parseInt(part);//转换整型化传入输出数组
        }
        return output;
    }
}
