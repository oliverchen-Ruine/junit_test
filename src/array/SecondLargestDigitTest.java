package array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description:
 * @Date:Create：in 2021/7/19 11:35
 * @Modified By：
 */
public class SecondLargestDigitTest {

    @Test
    public void secondHighest() {
        String s="abc1111";
        SecondLargestDigit secondLargestDigit = new SecondLargestDigit();
        int result = secondLargestDigit.secondHighest(s);
        System.out.println(result);
    }
}