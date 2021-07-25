package linked_list;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description:
 * @Date:Create：in 2021/7/24 9:33
 * @Modified By：
 */
public class AddTwoNumTest {

    @Test
    public void addTwoNumbers() {
        int[] ints1 = {9,9,9,9,9,9,9};
        int[] ints2 = {9,9,9,9};
        Node l1 = new Node(ints1[0],null);
        Node tmp1= l1;
        Node l2 = new Node(ints2[0],null);
        Node tmp2= l2;
        int i;
        for (i=1;i<ints1.length;i++){
            Node tmp = new Node(ints1[i],null);
            tmp1.setNext(tmp);
            tmp1=tmp;
        }
        for (i=1;i<ints2.length;i++){
            Node tmp = new Node(ints2[i],null);
            tmp2.setNext(tmp);
            tmp2=tmp;
        }
        AddTwoNum addTwoNum = new AddTwoNum();
        Node result = addTwoNum.addTwoNumbers(l1,l2);
        System.out.println(result);
    }
}