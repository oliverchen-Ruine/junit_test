package array;

import org.omg.PortableInterceptor.INACTIVE;

import java.sql.Connection;
import java.util.*;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description: 前 K 个高频元素
 * @Date:Create：in 2021/7/25 10:59
 * @Modified By：
 */
public class TopK {
    /**
     * 给你一个整数数组 nums 和一个整数 k ，请你返回其中出现频率前 k 高的元素。
     * 你可以按 任意顺序 返回答案。
     * @param nums
     * @param k
     * @return
     */
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int key:nums){
            if (hashMap.get(key)==null){
                hashMap.put(key,1);
            }else {
                int sum = hashMap.get(key);//获取当前数字的个数
                hashMap.put(key,sum+1);
            }
        }

        //对hashMap进行按value排序
        List<Map.Entry<Integer,Integer>> list = new ArrayList<>(hashMap.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue()-o1.getValue();//降序排序
            }
        });
        int[] keys = new int[hashMap.size()];
        int i=0;
        for (Map.Entry<Integer, Integer> entry:list){
            keys[i++]=entry.getKey();
        }
        int[] res = new int[k];
        for (i=0;i<k;i++){
            res[i]=keys[i];
        }
        return res;
    }
}
