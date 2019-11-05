package ReverseInteger;

/**
 * @program: InterviewQuestionTest
 * @description: 得出相反数
 * @author: jiangzq
 * @create: 2019-09-04 22:22
 **/
public class Solution_reverseinteger {
    public int reverse(int x) {
        int reversed=0;
        int pop;

        while (x != 0) {
            pop = x % 10;
            x /= 10;

            reversed = (reversed * 10) + pop;
        }
        return reversed;
    }
}
