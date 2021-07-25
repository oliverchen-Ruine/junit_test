package array;

import java.util.Stack;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description: 用两个栈实现队列
 * @Date:Create：in 2021/7/25 10:31
 * @Modified By：
 */
public class CQueue {
    /**
     * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，
     * 分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    private Stack<Integer> stack;
    private Stack<Integer> ustack;
    public CQueue() {
        this.stack=new Stack<>();
        this.ustack = new Stack<>();
    }

    public void appendTail(int value) {
        if(!this.ustack.isEmpty())//反栈不为空，将元素还原到原栈
        {
            while (!this.ustack.isEmpty()){
                this.stack.push(this.ustack.pop());
            }
        }
        this.stack.push(value);
    }

    public int deleteHead() {
        if (!this.stack.isEmpty()){
            while (!this.stack.isEmpty()){
                this.ustack.push(this.stack.pop());
            }
            return this.ustack.pop();
        }
        if (this.stack.isEmpty()&&!this.ustack.isEmpty()){
            return this.ustack.pop();
        }
        return -1;
    }
}
