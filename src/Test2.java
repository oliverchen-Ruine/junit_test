/**
 * @version 0.1
 * @Author: oliver chen
 * @Description: 将二进制整数奇偶位互换
 * @Date:Create：in 2021/3/11 13:20
 * @Modified By：
 */
public class Test2 {
    public static void main(String[] args) {
        int m=6;
        System.out.println(Integer.toString(m,2));
        int i=m&(0xaaaaaaaa);//1010 1010 1010 ... 1010
        int j=m&(0x55555555);//0101 0101 0101 ... 0101与运算
        int k=(i>>1)^(j<<1);
        System.out.println(Integer.toString(k,2));
    }
}
