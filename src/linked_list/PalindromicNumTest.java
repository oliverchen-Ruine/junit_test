package linked_list;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description:
 * @Date:Create：in 2021/7/21 10:51
 * @Modified By：
 */
public class PalindromicNumTest {

    @Test
    public void isPalindromic() {
        int[] ints = {1,2,3,4,3,2,1};
        int i=0;
        Node node = new Node(ints[i],null);
        Node node1 = node;
        for (i=1;i<ints.length;i++){
            Node tmp = new Node(ints[i],null);
            node1.setNext(tmp);
            node1=tmp;
        }
        Boolean result=new PalindromicNum().isPalindromic(node);
        System.out.println(result);
    }
}