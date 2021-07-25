package tree;

import org.junit.Test;
import sun.reflect.generics.tree.Tree;

import static org.junit.Assert.*;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description:
 * @Date:Create：in 2021/7/20 12:58
 * @Modified By：
 */
public class SubtreeTest {

    @Test
    public void isSubtree() {
        int[] root = {3,4,5,1,2};
        int[] subRoot = {4,1,2};
        int i=0;
        TreeNode rootTree = new TreeNode(root[i]);
        TreeNode tmp = rootTree;
        for (i=1;i<root.length;i++){
            if (root[i]!=0){
                TreeNode treeNode = new TreeNode(root[i]);
                if (tmp.getLeft()==null&&tmp.getRight()==null){
                    tmp.setLeft(treeNode);
                }else if (tmp.getLeft()!=null&&tmp.getRight()==null){
                    tmp.setRight(treeNode);
                    tmp=tmp.getLeft();
                }
            }else {

            }
        }
        i=0;
        TreeNode subTree = new TreeNode(subRoot[i]);
    }
}