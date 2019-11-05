package MaximumDepthOfBinaryTree;

/**
 * @program: InterviewQuestionTest
 * @description: 计算二叉树最长深度
 * @author: jiangzq
 * @create: 2019-09-05 16:12
 **/
public class Solution_maxDepth {
    public int maxDepth(TreeNode root) {

        if (root == null) {
            return 0;
        }
        int left_depth = maxDepth(root.left);
        int right_depth = maxDepth(root.right);

        return Math.max(left_depth, right_depth)+1;//因为根节点要加入
    }
}
