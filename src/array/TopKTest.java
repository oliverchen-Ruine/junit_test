package array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description:
 * @Date:Create：in 2021/7/25 11:35
 * @Modified By：
 */
public class TopKTest {

    @Test
    public void topKFrequent() {
        int[] nums={1,1,2,2,3};
        TopK topK = new TopK();
        int[] result = topK.topKFrequent(nums,2);
        for (int i :result){
            System.out.print(i);
        }
    }
}