/**
 * @version 0.1
 * @Author: oliver chen
 * @Description: 返回0到1之间小数的二进制
 * @Date:Create：in 2021/3/11 13:44
 * @Modified By：
 */
public class Test3 {
    public static void main(String[] args) {
        double num=0.25;
        StringBuilder stringBuilder=new StringBuilder("0.");
        while (num>0){
            num=num*2;
            if (num>=1){
                stringBuilder.append("1");
                num-=1;
            }else {
                stringBuilder.append("0");
            }
            if (stringBuilder.length()>32){
                System.out.println("ERROR");
                return;
            }
        }
        System.out.println(stringBuilder.toString());
    }
}
