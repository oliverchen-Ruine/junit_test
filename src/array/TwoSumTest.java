package array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description:
 * @Date:Create：in 2021/7/23 11:47
 * @Modified By：
 */
public class TwoSumTest {

    @Test
    public void twoSum() {
        int[] ints = {-1,-2,-3,-4,-5};
        TwoSum twoSum = new TwoSum();
        int[] result = twoSum.twoSum(ints,-8);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}