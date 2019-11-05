package BinaryTreeInorderTraversal;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @program: InterviewQuestionTest
 * @description: 二叉树后序遍历
 * @author: jiangzq
 * @create: 2019-08-26 16:28
 **/
public class Solution_inorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {

        Stack<TreeNode> stack = new Stack<>();//用栈的方式记录结点的顺序
        List<Integer> output_arr = new ArrayList<>();

        if (root == null) {
            return output_arr;
        }
        TreeNode current = root;

        while (current != null || !stack.isEmpty()) {
            while (current != null) {
                stack.push(current);//将item(current)推到此堆栈的顶部
                current = current.left;
            }
            current = stack.pop();//删除此堆栈顶部的对象并返回该对象
            output_arr.add(current.val);//将指定的元素追加到此列表的末尾
            current = current.right;
        }
        return output_arr;
    }
}
