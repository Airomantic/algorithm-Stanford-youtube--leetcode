package ReverseInteger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @program: InterviewQuestionTest
 * @description: 主函数类
 * @author: jiangzq
 * @create: 2019-09-04 22:19
 **/
public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int x = Integer.parseInt(line);
            int ret = new Solution_reverseinteger().reverse(x);
            String out = String.valueOf(ret);//数字直接转String，用于 System.out.println(out)的输出
            System.out.println(out);
        }
    }
}
