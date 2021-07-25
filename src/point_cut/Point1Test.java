package point_cut;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description:
 * @Date:Create：in 2021/7/15 11:53
 * @Modified By：
 */
public class Point1Test {

    @Test
    public void intersection() {
        Point1 point1 = new Point1();
        int[] start1={1,0},end1={1,1},start2={-1,0},end2={3,2};
        double[] result=point1.intersection(start1,end1,start2,end2);
        System.out.println(result[0]+"  "+result[1]);
    }
}