package array;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description:
 * @Date:Create：in 2021/7/24 15:46
 * @Modified By：
 */
public class SubsetsTest {

    @Test
    public void subsets() {
        int[]  ints={1,2,3};
        Subsets subsets = new Subsets();
        List<List<Integer>> result = subsets.subsets(ints);
        System.out.println(result);
    }
}