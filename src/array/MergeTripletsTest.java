package array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description:
 * @Date:Create：in 2021/7/21 12:49
 * @Modified By：
 */
public class MergeTripletsTest {

    @Test
    public void mergeTriplets() {
        int[][] triplets={{2,5,3},{1,8,4},{1,7,5}};
        int[] target={2,7,5};
        MergeTriplets mergeTriplets = new MergeTriplets();
        Boolean result = mergeTriplets.mergeTriplets(triplets,target);
        System.out.println(result);
    }
}