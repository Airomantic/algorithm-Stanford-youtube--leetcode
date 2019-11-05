package MergeTwoBinaryTrees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: InterviewQuestionTest
 * @description: 主函数类
 * @author: jiangzq
 * @create: 2019-09-02 11:15
 **/
public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            TreeNode t1 = stringToTreeNode(line);//字符转树节点
            line = in.readLine();
            TreeNode t2 = stringToTreeNode(line);//新的一行line
            TreeNode ret = new Solution_merge().mergeTree(t1, t2);
            String out = treeNodeToString(ret);
            System.out.println(out);
        }
    }

    private static String treeNodeToString(TreeNode root) {
        if (root == null) {
            return "[]";
        }
        String output = "";
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.remove();
            if (node == null) {
                output += "null,";
                continue;
            }
            output += String.valueOf(node.val) + ",";
            nodeQueue.add(node.left);
            nodeQueue.add(node.right);
        }
        return "[" + output.substring(0, output.length() - 2) + "]";
    }

    private static TreeNode stringToTreeNode(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return null;
        }
        String[] parts= input.split(",");
        String item = parts[0];
        TreeNode root = new TreeNode(Integer.parseInt(item));//第一个数为root
        Queue<TreeNode> nodeQueue =new LinkedList<>();//new一个队列，把结点放入
        nodeQueue.add(root);//加入根节点

        int index = 1;
        while (!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.remove();
            if (index == parts.length) {//只有一个，就跳出
                break;
            }
            item = parts[index++];
            item = item.trim();//去掉字符串两端的多余的空格，注意，是两端的空格，且无论两端的空格有多少个都会去掉,中间的空格不会去掉
            if (!item.equals("null")) {
                int leftNumber = Integer.parseInt(item);
                node.left = new TreeNode(leftNumber);
                nodeQueue.add(node.left);//左结点放入队列中
            }
            if (index == parts.length) {
                break;
            }
            item = parts[index++];
            item = item.trim();
            if (!item.equals("null")) {
                int rightNumber = Integer.parseInt(item);
                node.right = new TreeNode(rightNumber);
                nodeQueue.add(node.right);
            }
        }
        return root;
    }

}
