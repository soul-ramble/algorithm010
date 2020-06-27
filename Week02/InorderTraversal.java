package cn.study.practice.algorithm010;

import java.util.ArrayList;
import java.util.List;

/**
 * 94. 二叉树的中序遍历
 * @author yuqiang
 * @date 2020-06-27
 */
public class InorderTraversal {

  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> res = new ArrayList<>();
    helper(root,res);
    return res;
  }

  public void helper(TreeNode root, List<Integer> res) {
    if (root != null) {
      if (root.left != null) {
        helper(root.left, res);
      }
      res.add(root.val);
      if (root.right != null) {
        helper(root.right, res);
      }
    }
  }

  class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
  }
}
