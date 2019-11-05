package ReverseLinkedList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @program: interviewQuestion
 * @description: 主函数类
 * @author: jiangzq
 * @create: 2019-08-21 23:13
 **/
public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine() )!= null) {
            ListNode head = stringToListNode(line);
            ListNode ret = new Solution_reverse().reverseList(head);
            String out = ListNodeToString(ret);
            System.out.println(out);

        }
    }

    private static String ListNodeToString(ListNode node) {
        if (node == null) {
            return "[]";
        }
        String result = "";
        while (node != null) {
            result += Integer.toString(node.val)+",";//整型转化为字符串
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 1) + "]";
    }

    private static ListNode stringToListNode(String input) {
        // Generate array from the input 从输入生成数组（整型）
        int[] nodeValues = stringToIntegerArray(input);

        // Now convert that list into linked list 现在将该列表转换为链接列表
        ListNode dummyRoot =new ListNode(0);
        ListNode ptr = dummyRoot;
        for (int item : nodeValues) {
            ptr.next = new ListNode(item);
            ptr=ptr.next;
        }
        return dummyRoot.next;
        }

    private static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return new int[0];
        }
        String[] parts= input.split(",");
        int[] output = new int[parts.length];
        for (int index = 0; index < parts.length; index++) {
            String part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }
}
