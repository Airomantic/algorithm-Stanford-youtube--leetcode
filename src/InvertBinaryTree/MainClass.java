package InvertBinaryTree;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @program: InterviewQuestionTest
 * @description: 主函数类
 * @author: jiangzq
 * @create: 2019-09-02 20:25
 **/
public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line=in.readLine())!=null) {
            TreeNode root = stringToTreeNode(line);
            TreeNode ret = new Solution_Invert().InvertTree(root);
            String out = treeNodeToString(ret);
            System.out.println(out);
        }
    }

    private static String treeNodeToString(TreeNode root) {
        if (root == null) {
            return "[]";
        }
        String output = "";
        Queue<TreeNode> nodeQueue = new LinkedList<>();//从TreeNode的链接列表Linkedlist<>()下的构造器中创建新的结点，加入队列
        nodeQueue.add(root);
        while (!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.remove();

            if (node == null) {
                output += "null";
                continue;
            }
            output += String.valueOf(node.val) + ",";
            nodeQueue.add(node.left);
            nodeQueue.add(node.right);
        }
        return "[" + output.substring(0, output.length() - 2)+"]";
    }

    private static TreeNode stringToTreeNode(String input) {
        input = input.trim();
        input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return null;
        }
        String[] parts = input.split(",");
        String item = parts[0];
        TreeNode root = new TreeNode(Integer.parseInt(item));
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.add(root);

        int index = 1;
        while (!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.remove();

            if (index == parts.length) {//[1]
                break;
            }
            item = parts[index++];
            item = item.trim();
            if (!item.equals("null")) {
                int leftNumber = Integer.parseInt(item);
                node.left = new TreeNode(leftNumber);
                nodeQueue.add(node.left);
            }
            if (index == parts.length) {//[2]
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
