package array;

import java.util.*;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description: 从相邻元素对还原数组
 * @Date:Create：in 2021/7/25 9:10
 * @Modified By：
 */
public class AdjacentPairs {
    /**
     * 存在一个由 n 个不同元素组成的整数数组 nums ，但你已经记不清具体内容。
     * 好在你还记得 nums 中的每一对相邻元素。
     *
     * 给你一个二维整数数组 adjacentPairs ，大小为 n - 1 ，
     * 其中每个 adjacentPairs[i] = [ui, vi] 表示元素 ui 和 vi 在 nums 中相邻。
     *
     * 题目数据保证所有由元素 nums[i] 和 nums[i+1] 组成的相邻元素对都存在于 adjacentPairs 中，
     * 存在形式可能是 [nums[i], nums[i+1]] ，也可能是 [nums[i+1], nums[i]] 。
     * 这些相邻元素对可以 按任意顺序 出现。
     *
     * 返回 原始数组 nums 。如果存在多种解答，返回 其中任意一个 即可。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/restore-the-array-from-adjacent-pairs
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    /**
     * 找端点，端点只出现一次，通过HashMap映射特性推后面元素
     * @param adjacentPairs
     * @return
     */
    public int[] restoreArray(int[][] adjacentPairs) {
        HashMap<Integer, List<Integer>> hashMap = new HashMap<>();
        for (int[] adjacentPair:adjacentPairs){
            List<Integer> first = hashMap.get(adjacentPair[0]);
            List<Integer> second = hashMap.get(adjacentPair[1]);
            if (first==null){
                first = new ArrayList<>();
                hashMap.put(adjacentPair[0],first);
            }
            if (second==null){
                second = new ArrayList<>();
                hashMap.put(adjacentPair[1],second);
            }
            first.add(adjacentPair[1]);//左与右匹配
            second.add(adjacentPair[0]);//右与左匹配
        }
        int len = adjacentPairs.length+1;//待求结果长度
        int[] res = new int[len];
        int follow=0;
        //遍历高容量的hashMap,找到首元素结点
        for(Map.Entry<Integer,List<Integer>> entry:hashMap.entrySet()){
            List<Integer> value = entry.getValue();
            if (value.size()==1){
                res[0]=entry.getKey();
                follow = value.get(0);
                break;
            }
        }
        //从首元素开始遍历hashMap
        for (int i=1;i<res.length;i++){
            res[i]=follow;
            List<Integer> tmp = hashMap.get(follow);
            if (tmp.size()==2) {
                if (tmp.get(0)!=res[i-1]){
                    follow=tmp.get(0);
                }else{
                    follow=tmp.get(1);
                }
            }
        }
        return res;
    }
}
