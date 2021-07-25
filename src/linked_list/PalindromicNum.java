package linked_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description: 链表实现判断是否为回文数
 * @Date:Create：in 2021/7/21 10:44
 * @Modified By：
 */
public class PalindromicNum {
    /**
     * 判断是否为回文数
     * 设置快慢两个指针
     * @param node
     * @return
     */
    public boolean isPalindromic(Node node){
        Node fast = node;//快指针每次两步
        Node slow =node;//慢指针每次一步
        //快指针为空时，链长为偶数
        while(fast!=null){
            if(fast.getNext()==null)break;//快指针不为空而下一节点为空时，链长为奇数
            fast=fast.getNext().getNext();
            slow=slow.getNext();
        }
        //后半部分逆序输出
        StringBuilder stringBuilder = new StringBuilder("");//后半部分数据
        StringBuilder stringBuilder1 = new StringBuilder("");//前半部分数据
        Stack<Object> stack = new Stack<>();
        Node tmp=slow;
        while (tmp!=null){
            stack.push(tmp.getData());
            tmp=tmp.getNext();
        }
        while (!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }
        Node tmp1 = node;
        while (tmp1!=slow){
            stringBuilder1.append(tmp1.getData());
            tmp1=tmp1.getNext();
        }
        //额外关注奇数情况
        if (fast!=null) stringBuilder1.append(slow.getData());
        boolean istrue = true;
        if (!stringBuilder.toString().equals(stringBuilder1.toString()))istrue=false;
        return istrue;
    }

}
