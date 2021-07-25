package array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description:
 * @Date:Create：in 2021/7/25 15:56
 * @Modified By：
 */
public class FibArrayTest {

    @Test
    public void fib() {
        FibArray fibArray = new FibArray();
        int res =fibArray.fib(45);
        System.out.println(res);
    }
}