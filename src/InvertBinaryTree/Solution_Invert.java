package InvertBinaryTree;

/**
 * @program: InterviewQuestionTest
 * @description: 反转二叉树
 * @author: jiangzq
 * @create: 2019-09-02 21:30
 **/
public class Solution_Invert {
    public TreeNode InvertTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode left = InvertTree(root.left);
        TreeNode right = InvertTree(root.right);

        //swap
        root.right = left;
        root.left = right;

        return root;
    }
}
