package array;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description: 合并若干三元组以形成目标三元组
 * @Date:Create：in 2021/7/21 12:42
 * @Modified By：
 */

/**
 * 三元组 是一个由三个整数组成的数组。给你一个二维整数数组 triplets
 * 其中 triplets[i] = [ai, bi, ci] 表示第 i 个 三元组
 * 同时，给你一个整数数组 target = [x, y, z] ，表示你想要得到的 三元组 。
 *
 * 为了得到 target ，你需要对 triplets 执行下面的操作 任意次（可能 零 次）：
 *
 * 选出两个下标（下标 从 0 开始 计数）i 和 j（i != j），并 更新 triplets[j] 为 [max(ai, aj), max(bi, bj), max(ci, cj)] 。
 * 例如，triplets[i] = [2, 5, 3] 且 triplets[j] = [1, 7, 5]，
 * triplets[j] 将会更新为 [max(2, 1), max(5, 7), max(3, 5)] = [2, 7, 5] 。
 *
 * 如果通过以上操作我们可以使得目标 三元组 target 成为 triplets 的一个 元素 ，则返回 true ；否则，返回 false 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-triplets-to-form-target-triplet
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class MergeTriplets {
    /**
     * 是否可以形成三元组
     * @param triplets
     * @param target
     * @return
     */
    public boolean mergeTriplets(int[][] triplets, int[] target) {
        int a=0,b=0,c=0;
        for(int[] triplet : triplets){
            if (triplet[0]<=target[0]&&triplet[1]<=target[1]&&triplet[2]<=target[2]){//数组中每一个元素要小于或等于目标元素
                a=Math.max(a,triplet[0]);
                b=Math.max(b,triplet[1]);
                c=Math.max(c,triplet[2]);
            }
        }
        return a==target[0]&&b==target[1]&&c==target[2];
    }
}
