package array;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description:
 * @Date:Create：in 2021/7/23 11:33
 * @Modified By：
 */
public class TwoSum {
    /**
     * 给定一个整数数组 nums 和一个整数目标值 target，
     * 请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标
     */

    public int[] twoSum(int[] nums, int target) {

        int[] ints = {0,0};
        /**
         * hash表，建立<key,value>一一对应关系
         */
        HashMap<Integer,Integer> hashMap = new HashMap<Integer, Integer>();
        for (int i=0;i<nums.length;i++){
            if (hashMap.containsKey(nums[i])){//找到了该补数
                ints[0]=i;
                ints[1]=hashMap.get(nums[i]);
                return ints;
            }
            //key中存放当前数补数，value存放当前数的位置
            hashMap.put(target-nums[i],i);
        }
        /**
         * 双重循环
         */
//        int i=0,j;
//        Boolean flag=false;
//        while (i<nums.length){
//            if ((nums[i]<=target&&target>=0)||nums[i]>=target&&target<0){
//                ints[0]=i;
//                j=0;
//                while (j<nums.length){
//                    if (i!=j&&nums[j]+nums[ints[0]]==target){
//                        ints[1]=j;
//                        flag=true;
//                        break;
//                    }else {
//                        ++j;
//                    }
//                }
//            }
//            if (flag){
//                break;
//            }
//            ++i;
//        }
        return ints;
    }
}
