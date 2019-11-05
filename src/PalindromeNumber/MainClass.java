package PalindromeNumber;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @program: InterviewQuestionTest
 * @description: 主函数方法
 * @author: jiangzq
 * @create: 2019-09-04 20:23
 **/
public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);
            boolean ret = new Solution_Palindrome().isPalindrome(x);
            String out = booleanToString(ret);
            System.out.println(out);
        }
    }

    public static String booleanToString(boolean input) {
        return input ? "True" : "False";
    }
}
