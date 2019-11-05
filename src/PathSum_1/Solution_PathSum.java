package PathSum_1;

import java.util.Stack;

/**
 * @program: InterviewQuestionTest
 * @description: 给定二叉树和求和，确定树是否具有根到叶路径，使得沿路径的所有值相加等于给定的总和。
 * @author: jiangzq
 * @create: 2019-09-10 10:00
 **/
public class Solution_PathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;

        Stack<TreeNode> node_stack = new Stack<>();
        Stack<Integer> sum_stack = new Stack<>();

        node_stack.add(root);
        sum_stack.add(sum - root.val);//sum减去root.val

        while (!node_stack.isEmpty()) {
            TreeNode current_node = node_stack.pop();//溢出栈
            int current_sum = sum_stack.pop();

            if (current_node.left == null && current_node.right == null && current_sum == 0) {
                return true;
            }
            if (current_node.left != null) {
                node_stack.add(current_node.left);
                sum_stack.add(current_sum - current_node.left.val);
            }
            if (current_node.right != null) {
                node_stack.add(current_node.right);
                sum_stack.add(current_sum - current_node.right.val);
            }
        }
        return false;
    }
}
