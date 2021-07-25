package array;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description:
 * @Date:Create：in 2021/7/18 10:40
 * @Modified By：
 */
public class MountainArrayTest {

    @Test
    public void peakIndexInMountainArray() {
        int[] arr = {2,3,4,5,1};
        MountainArray mountainArray = new MountainArray();
        int index = mountainArray.peakIndexInMountainArray(arr);
        System.out.println(index);
    }
}