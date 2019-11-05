package MergeTwoBinaryTrees;

/**
 * @program: InterviewQuestionTest
 * @description: 合并二叉树
 * @author: jiangzq
 * @create: 2019-09-02 17:29
 **/
public class Solution_merge {
    public TreeNode mergeTree(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            return t2;
        }
        if (t2 == null) {
            return t1;
        }
        t1.val += t2.val;
        t1.left = mergeTree(t1.left, t2.left);
        t2.right = mergeTree(t1.right, t2.right);
        return t1;
    }
}
