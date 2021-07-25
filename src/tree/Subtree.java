package tree;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description:
 * @Date:Create：in 2021/7/20 12:38
 * @Modified By：
 */
public class Subtree {

    /**
     * 给你两棵二叉树 root 和 subRoot 。检验 root 中是否包含和 subRoot 具有相同结构和节点值的子树。
     * 如果存在，返回 true ；否则，返回 false 。
     *
     * 二叉树 tree 的一棵子树包括 tree 的某个节点和这个节点的所有后代节点。tree 也可以看做它自身的一棵子树。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/subtree-of-another-tree
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * 子树要么与原树相同
     * 要么是原树的左子树
     * 要么是原树的右子树
     */

    /**
     * 判断是否为子树
     * @param root
     * @param subRoot
     * @return
     */
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root==null)return false;//原树都遍历完了，说明不是
        return isSameTree(root,subRoot)||isSubtree(root.getLeft(),subRoot)||isSubtree(root.getRight(),subRoot);
    }

    /**
     * 判断两树是否相同
     * @param root
     * @param subRoot
     * @return
     */
    public boolean isSameTree(TreeNode root, TreeNode subRoot){
        if (root==null&&subRoot==null)return true;//同时为空，两树相同
        if (root==null||subRoot==null)return false;//不同时为空，进行下一步遍历
        if (root.getVal()!=subRoot.getVal())return false;//判断结点是否相同
        return isSameTree(root.getLeft(),subRoot.getLeft())&&isSameTree(root.getRight(),subRoot.getRight());//同时判断左右结构
    }
}
