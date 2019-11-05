package BinaryTreeInorderTraversal;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program: InterviewQuestionTest
 * @description: 返回其节点值的中序遍历
 * @author: jiangzq
 * @create: 2019-08-26 13:22
 **/
public class MainClass {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            TreeNode root = stringToTreeNode(line);
            List<Integer> ret = new Solution_inorderTraversal().inorderTraversal(root);
            String out = IntegerArrayListToString(ret);
            System.out.println(out);
        }
    }

    private static String IntegerArrayListToString(List<Integer> nums) {
        return integerArrayListToString(nums, nums.size());

    }

    public static String integerArrayListToString(List<Integer> nums, int length) {//length = nums.size()
        if (length == 0) {
            return "[]";
        }
        String result = "";
        for (int index = 0; index < length; index++) {
            Integer number = nums.get(index);//int下标 -> Integer的 nums(index)
            result += Integer.toString(number) + ",";
        }
        return "[" + result.substring(0, result.length() - 1) + "]";
    }

    private static TreeNode stringToTreeNode(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.length() == 0) {
            return null;
        }
        String[] parts= input.split(",");
        String item = parts[0];//第一个字符
        TreeNode root = new TreeNode(Integer.parseInt(item));
        Queue<TreeNode> nodeQueue = new LinkedList<>();//将链表放入结点
        nodeQueue.add(root);

        int index = 1;
        while (!nodeQueue.isEmpty()) {
            TreeNode node = nodeQueue.remove();

            if (index == parts.length) {
                break;
            }
            item = parts[index++];
            item = item.trim();
            if (!item.equals("null")) {
                int leftNumber = Integer.parseInt(item);
                node.left = new TreeNode(leftNumber);
                nodeQueue.add(node.left);
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
