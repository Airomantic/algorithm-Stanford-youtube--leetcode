package PalindromeNumber;

/**
 * @program: InterviewQuestionTest
 * @description: 判断回文数
 * @author: jiangzq
 * @create: 2019-09-04 20:24
 * 个人理解：
 * pop：相当于get的操作，就是只是查看。
 * poll：相当于先get然后再remove掉，就是查看的同时，也将这个元素从容器中删除掉。
 * jdk官方解释：
 * pop() 从此列表所表示的堆栈处弹出一个元素。
 * poll() 获取并移除此列表的头（第一个元素）
 **/
public class Solution_Palindrome {
    public boolean isPalindrome(int x) {
        if (x == 0) {
            return true;
        }
        int reversed_int = 0;
        while (x > reversed_int) {
            int pop = x % 10;//溢出个位数字
            x /= 10;//逐个输出这个数除个位数之外的数字
            reversed_int = (reversed_int * 10) + pop;//逐个压入高位数（或往左压）
        }
        if (x == reversed_int || x == reversed_int / 10) {//第二个比如：11
            return true;
        } else {
            return false;
        }
    }
}
