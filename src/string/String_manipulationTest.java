package string;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description:
 * @Date:Create：in 2021/7/17 11:27
 * @Modified By：
 */
public class String_manipulationTest {

    @Test
    public void maximumGain() {
        String s="cdbcbbaaabab";
        int x=4,y=5;
        String_manipulation stringManipulation = new String_manipulation(null,0);
        int sum=stringManipulation.maximumGain(s,x,y);
        System.out.println(sum);
    }
}