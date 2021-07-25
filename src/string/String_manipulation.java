package string;

import java.util.Stack;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description: 删除子字符串的最大得分
 * @Date:Create：in 2021/7/17 10:06
 * @Modified By：
 */
public class String_manipulation {
    /**
     * 给你一个字符串 s 和两个整数 x 和 y 。你可以执行下面两种操作任意次。
     *
     *     删除子字符串 "ab" 并得到 x 分。
     *         比方说，从 "cabxbae" 删除 ab ，得到 "cxbae" 。
     *     删除子字符串"ba" 并得到 y 分。
     *         比方说，从 "cabxbae" 删除 ba ，得到 "cabxe" 。
     *
     * 请返回对 s 字符串执行上面操作若干次能得到的最大得分。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/maximum-score-from-removing-substrings
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    private String afterString;
    private int sum;
    public String_manipulation(String afterString,int sum){
        this.afterString=afterString;
        this.sum=sum;
    }
    /**
     * 贪心算法，那个大先算那个
     * 难点在对子字符串的分辨过程
     *
     * @param s
     * @param x
     * @param y
     * @return
     */
    public int maximumGain(String s, int x, int y) {
        if (s == null) {
        return 0;
        }
        int sum=0;
        if (x>y){
            String_manipulation string_manipulation = deleteStr(s,'a','b',x);
            sum+=string_manipulation.sum;
            String_manipulation string_manipulation1 = deleteStr(string_manipulation.afterString,'b','a',y);
            sum+=string_manipulation1.sum;
        }else {
            String_manipulation string_manipulation = deleteStr(s,'b','a',y);
            sum+=string_manipulation.sum;
            String_manipulation string_manipulation1 = deleteStr(string_manipulation.afterString,'a','b',x);
            sum+=string_manipulation1.sum;
        }

        return sum;
    }
    private String_manipulation deleteStr(String s,char start,char end,int record){
        Stack<Character> stack = new Stack<>();//初始化一个栈
        char[] chars=s.toCharArray();//将字符串转换为字符数组
        int sum=0;
        int i=0;
        while (i<s.length()){
            if (stack.isEmpty()){
                stack.push(chars[i]);//栈为空，入栈
            }else if (stack.peek()==start&&chars[i]==end){//匹配，得分出栈
                sum+=record;
                stack.pop();
            }else {
                stack.push(chars[i]);//字符不匹配入栈
            }
            i++;
        }
        StringBuilder stringBuilder = new StringBuilder("");
        while (!stack.isEmpty()){
            stringBuilder.append(stack.pop());
        }
        //栈先进后出顺序逆置
        char[] chars1 = stringBuilder.toString().toCharArray();
        i=0;
        while (i<stringBuilder.toString().length()){
            stack.push(chars1[i]);
            i++;
        }
        StringBuilder stringBuilder1 = new StringBuilder("");
        while (!stack.isEmpty()){
            stringBuilder1.append(stack.pop());
        }
        return new String_manipulation(stringBuilder1.toString(),sum);
    }
}
