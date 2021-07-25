package array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description:
 * @Date:Create：in 2021/7/24 17:33
 * @Modified By：
 */
public class LatestTimeTest {

    @Test
    public void maximumTime() {
        String time = "19:22";
        LatestTime latestTime = new LatestTime();
        String res = latestTime.maximumTime(time);
        System.out.println(res);
    }
}