package SymmetricTree;

/**
 * @program: InterviewQuestionTest
 * @description: 对称二叉树
 * @author: jiangzq
 * @create: 2019-09-05 20:59
 **/
public class Solution_Symmetric {
    public boolean isSymmetric(TreeNode root) {
        return isMirror(root, root);
    }

    private boolean isMirror(TreeNode t1, TreeNode t2) {
        if(t1 == null&&t2==null) return true;
        if (t1==null|| t2==null) return false;

        return (t1.val == t2.val) && isMirror(t1.left, t2.right) && isMirror(t1.right, t2.left);
    }
}
