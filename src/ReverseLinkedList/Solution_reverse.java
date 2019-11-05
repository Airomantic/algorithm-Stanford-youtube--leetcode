package ReverseLinkedList;

/**
 * @program: interviewQuestion
 * @description: 反向链接列表
 * @author: jiangzq
 * @create: 2019-08-25 14:38
 **/
public class Solution_reverse {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;

        while (head != null) {
            ListNode next = head.next;
            head.next = prev;//先把结点向下以一个
            prev = head;//再把值传下去
            head = next;//循环传递，即最后一个传到第一个
        }
        return prev;//从第一个开始输出
    }
}
