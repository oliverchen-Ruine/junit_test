package tree;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description: 定义一颗二叉树
 * @Date:Create：in 2021/7/20 12:39
 * @Modified By：
 */
class TreeNode {

          private int val;
          private TreeNode left;
          private TreeNode right;
          TreeNode() {}
          TreeNode(int val) { this.val = val; }
          TreeNode(int val, TreeNode left, TreeNode right) {
              this.val = val;
              this.left = left;
              this.right = right;
         }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }
}
