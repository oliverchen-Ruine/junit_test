package linked_list;

import java.util.Stack;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description: 两数相加
 * @Date:Create：in 2021/7/24 9:16
 * @Modified By：
 */
public class AddTwoNum {
    /**
     * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
     *
     * 请你将两个数相加，并以相同形式返回一个表示和的链表。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/add-two-numbers
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public Node addTwoNumbers(Node l1, Node l2) {
        /**
         * 老实人做法
         * ulong无法满足链长过长
         */
//        StringBuilder stringBuilder  = new StringBuilder("");
//        StringBuilder stringBuilder1 = new StringBuilder("");
//        Stack<Object> stack = new Stack<>();
//        Node tmp = l1;
//        Node tmp1= l2;
//        while (tmp!=null){
//            stack.push(tmp.getData());
//            tmp=tmp.getNext();
//        }
//        while (!stack.isEmpty()){
//            stringBuilder.append(stack.pop());
//        }
//        while (tmp1!=null){
//            stack.push(tmp1.getData());
//            tmp1=tmp1.getNext();
//        }
//        while (!stack.isEmpty()){
//            stringBuilder1.append(stack.pop());
//        }
//        int sum = Integer.parseInt(stringBuilder.toString())+Integer.parseInt(stringBuilder1.toString());
//        char[] chars = Integer.toString(sum).toCharArray();
//        for(int i=0;i<chars.length;i++){
//            stack.push(Character.getNumericValue(chars[i]));
//        }
//        Node node = new Node(stack.pop(),null);
//        Node tmp2 = node;
//        while (!stack.isEmpty()){
//            Node tmp3 = new Node(stack.pop(),null);
//            tmp2.setNext(tmp3);
//            tmp2 = tmp3;
//        }
//        return node;
        Node root = new Node(0);
        Node tmp = root;
        int carry = 0;
        while (l1!=null||l2!=null||carry!=0){
            int l1val = l1!=null?(int)l1.getData():0;
            int l2val = l2!=null?(int)l2.getData():0;
            int sum = l1val+l2val+carry;
            carry=sum/10;
            Node tmp1 = new Node(sum%10,null);
            tmp.setNext(tmp1);
            tmp=tmp1;

            if (l1!=null)l1=l1.getNext();
            if (l2!=null)l2=l2.getNext();
        }
        return root.getNext();
    }
}
