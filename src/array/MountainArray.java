package array;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description: 山脉数组峰值索引
 * @Date:Create：in 2021/7/18 10:24
 * @Modified By：
 */
public class MountainArray {
    /**
     * 符合下列属性的数组 arr 称为 山脉数组 ：
     *
     *     arr.length >= 3
     *     存在 i（0 < i < arr.length - 1）使得：
     *         arr[0] < arr[1] < ... arr[i-1] < arr[i]
     *         arr[i] > arr[i+1] > ... > arr[arr.length - 1]
     *
     * 给你由整数组成的山脉数组 arr ，返回任何满足 arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1] 的下标 i 。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/peak-index-in-a-mountain-array
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public int peakIndexInMountainArray(int[] arr) {
        /**
         * 二分查找适合当前数组的排列规则，时间复杂度为O(log(n))
         */
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while (low<high){
            mid=low + (high-low)/2;
            if (arr[mid-1]<arr[mid]&&arr[mid]>arr[mid+1]){//左边和右边都小于mid说明找到了峰值
                break;
            }else if (arr[mid-1]>arr[mid]){//左边大于mid，说明峰值在左边
                high=mid;
            }else if (arr[mid+1]>arr[mid]){//右边大于mid,说明峰值在右边
                low=mid;
            }
        }
        return mid;
    }
}
