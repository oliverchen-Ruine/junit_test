package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description: 字符串中第二大的数字
 * @Date:Create：in 2021/7/19 11:24
 * @Modified By：
 */
public class SecondLargestDigit {
    /**
     * 给你一个混合字符串 s ，请你返回 s 中 第二大 的数字，如果不存在第二大的数字，请你返回 -1 。
     *
     * 混合字符串 由小写英文字母和数字组成。
     */
    public int secondHighest(String s) {
        List<Integer> list = new ArrayList<>();
        int i;
        for (i=0;i<s.length();i++){
            if (Character.isDigit(s.charAt(i))&&!list.contains(Character.getNumericValue(s.charAt(i)))){
                list.add(Character.getNumericValue(s.charAt(i)));
            }
        }
        if (list.size()<=1){
            return -1;
        }else {
            Collections.sort(list);
        }
        return list.get(list.size()-2);
    }
}
