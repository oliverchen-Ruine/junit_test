package linked_list;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description: 链表相交问题
 * @Date:Create：in 2021/4/7 19:50
 * @Modified By：
 */
public class Intersect {
    public static Node LinkIntersect(Node node1,Node node2){
        Node lNode = node1;
        Node sNode = node2;
        Node node = null;
        int num1 =0 ,num2 =0,step =0;

        //统计两条链长
        while (lNode!=null){
            num1++;
            lNode=lNode.getNext();
        }
        while (sNode!=null){
            num2++;
            sNode=sNode.getNext();
        }

        //重置长短链
        lNode = node1;
        sNode = node2;
        step=num1-num2;
        if (num1<num2){
            lNode = node2;
            sNode = node1;
            step = num2-num1;
        }
        node=lNode;
        while (step!=0){
            step--;
            node=node.getNext();
        }
        while (node!=null&&sNode!=null){
            if (node==sNode){
                return node;
            }
            node=node.getNext();
            sNode=sNode.getNext();
        }
        return null;
    }

    public static void main(String[] args) {
        Node node = new Node(0,null);
        Node node1 = node;
        for(int i=1;i<5;i++){
            Node temp = new Node(i,null);
            node1.setNext(temp);
            node1=temp;
        }

        Node lnode= new Node('l',null);
        Node node2 = lnode;
        for(int i=10;i<15;i++){
            Node temp = new Node(i,null);
            node2.setNext(temp);
            node2=temp;
        }
        node2.setNext(node);

        Node snode= new Node('s',null);
        Node node3 = snode;
        for(int i=7;i<9;i++){
            Node temp = new Node(i,null);
            node3.setNext(temp);
            node3=temp;
        }
        node3.setNext(node);
        //Inversion.Noderesult(lnode);
        //Inversion.Noderesult(snode);
        Node re = LinkIntersect(lnode,snode);
        if (re!=null){
            System.out.println("Yeh,We found that their intersection point. It`s "+re);
        }else {
            System.out.println("They do not intersect");
        }
    }
}
