package array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description:
 * @Date:Create：in 2021/7/23 11:10
 * @Modified By：
 */
public class MissingNumberTest {

    @Test
    public void findKthPositive() {
        int[] ints = {1,2,3,4};
        MissingNumber missingNumber = new MissingNumber();
        int result=missingNumber.findKthPositive(ints,2);
        System.out.println(result);
    }
}