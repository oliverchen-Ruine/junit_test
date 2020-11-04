/**
 * @version 0.1
 * @Author: oliver chen
 * @Description: 水仙花
 * @Date:Create：in 2020/11/3 20:48
 * @Modified By：
 */
public class WaterFlower {

    public int result(int num){
       int bits,ten,hundreds;
       int temp,flag=0;
        hundreds=num/100;
        ten=num/10-hundreds*10;
        bits=num%10;
        temp=bits*bits*bits+ten*ten*ten+hundreds*hundreds*hundreds;
        if(temp==num){
            flag=1;//1表示水仙花数 0表示不是水仙花数
        }
       return flag;
    }
}
