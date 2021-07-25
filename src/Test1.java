/**
 * @version 0.1
 * @Author: oliver chen
 * @Description: 统计一个数的二进制中有多少个1
 * @Date:Create：in 2021/3/8 19:52
 * @Modified By：
 */
public class Test1 {
    public static void main(String[] args) {
        int m=11;
        System.out.println(Integer.toString(m,2));
        int count=0;
//        for (int i=0;i<32;i++){
//            if((m&(1<<i))==(1<<i)){
//                count++;
//            }
//        }
        if (((m-1)&m)==0){
            count++;
        }
        System.out.println(count);

    }

}       
