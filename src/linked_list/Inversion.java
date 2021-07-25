package linked_list;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description: 链表反转
 * @Date:Create：in 2021/4/7 18:34
 * @Modified By：
 */
public class Inversion {
    public static void main(String[] args) {
        Node node = new Node(0,null);
        Node node1 = node;
        for(int i=1;i<9;i++){
            Node node2 = new Node(i,null);
            node1.setNext(node2);
            node1=node2;
        }
        //Noderesult(node);
        Node reNode = Inversion(node);
        Noderesult(reNode);
    }

    public static Node Inversion(Node node){
        if (node==null||node.getNext()==null){return node;}

        Node beg=null;
        Node mid=node;
        Node end=null;
        do {
            end=mid.getNext();
            mid.setNext(beg);//当前节点指向前一个节点
            beg=mid;//指针后移
            mid=end;
        }while (end!=null);
        return beg;
    }
    public static void Noderesult(Node node){
        do {
            System.out.println(node.getData());
            node=node.getNext();
        }
        while (node!=null);
    }
}
