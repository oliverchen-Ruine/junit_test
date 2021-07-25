package array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description:
 * @Date:Create：in 2021/7/25 10:06
 * @Modified By：
 */
public class AdjacentPairsTest {

    @Test
    public void restoreArray() {
        int[][] adjacentPairs={{2,1},{3,4},{3,2}};
        AdjacentPairs adjacentPairs1 = new AdjacentPairs();
        int[] result= adjacentPairs1.restoreArray(adjacentPairs);
        for (int i=0;i<result.length;i++){
            System.out.print(result[i]);
        }
    }
}