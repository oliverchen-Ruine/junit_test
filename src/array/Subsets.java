package array;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description: 子集求闭包
 * @Date:Create：in 2021/7/24 13:46
 * @Modified By：
 */
public class Subsets {
    /**
     * 给你一个整数数组 nums ，数组中的元素 互不相同 。返回该数组所有可能的子集（幂集）。
     *
     * 解集 不能 包含重复的子集。你可以按 任意顺序 返回解集
     */
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        for (int i=0;i<nums.length;i++){
            int size = res.size();
            for (int j=0;j<size;j++){
                List<Integer> tmp = new ArrayList<>(res.get(j));
                tmp.add(nums[i]);
                res.add(tmp);
            }
        }
        return res;
    }
}
