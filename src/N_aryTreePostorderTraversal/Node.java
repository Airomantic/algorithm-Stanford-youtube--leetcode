package N_aryTreePostorderTraversal;

import java.util.List;

/**
 * @program: InterviewQuestionTest
 * @description: 链表类 Node的定义
 * @author: jiangzq
 * @create: 2019-08-26 08:27
 **/
public class Node {
    public int val;
    public List<Node> children;

    public Node(int i) {

    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}
