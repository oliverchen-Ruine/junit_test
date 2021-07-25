package compiling;


/**
 * @version 0.1
 * @Author: oliver chen
 * @Description: 抽象语法树的数据结构(二叉树)
 * @Date:Create：in 2021/7/13 11:40
 * @Modified By：
 */
public class AST {
    /**
     * mknode(op,left,right),mkleaf(id,entry),mkleaf(num,val)
     * type是操作符号判断是+|-|*|/|i|n|
     * data保存entry or val
     */
    private AST left;//左子树
    private AST right;//右子树
    private String type;
    private DataForm data;
    public AST(DataForm data){
        this.data=data;
        this.left=null;
        this.right=null;
    }

    public AST getLeft() {
        return left;
    }

    public void setLeft(AST left) {
        this.left = left;
    }

    public AST getRight() {
        return right;
    }

    public void setRight(AST right) {
        this.right = right;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public DataForm getData() {
        return data;
    }

    public void setData(DataForm data) {
        this.data = data;
    }
}
