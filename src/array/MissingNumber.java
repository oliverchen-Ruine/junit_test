package array;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description:
 * @Date:Create：in 2021/7/23 10:57
 * @Modified By：
 */

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个 严格升序排列 的正整数数组 arr 和一个整数 k 。
 *
 * 请你找到这个数组里第 k 个缺失的正整数。
 */
public class MissingNumber {

    /**
     * 查找缺失正整数
     * @param arr
     * @param k
     * @return
     */
    public int findKthPositive(int[] arr, int k) {
        List<Integer> list = new ArrayList<>();
        int i=0,j=1;
        while (i<arr.length){
            while (j<=arr[i]){
                if (j!=arr[i]) {
                    list.add(j);
                }
                ++j;
            }
            ++i;
        }
        int result =0;
        if (k>list.size()){
            result = arr[arr.length-1]+(k-list.size());
        }else {
            result = list.get(k-1);
        }
        return result;
    }
}
