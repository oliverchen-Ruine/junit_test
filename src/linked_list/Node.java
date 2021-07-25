package linked_list;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description: 链表定义
 * @Date:Create：in 2021/4/7 18:23
 * @Modified By：
 */
public class Node {
    private Object data;//数据域
    private Node next;//指针域

    public Node(Object data,Node next){
        this.data=data;
        this.next=next;
    }
    public Node(Object data){
        this.data= data;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}
