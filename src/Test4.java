import java.util.ArrayList;
import java.util.List;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description: 强整数
 * @Date:Create：in 2021/3/11 14:02
 * @Modified By：
 */
/**
 * 输入：x = 2, y = 3, bound = 10
 * 输出：[2,3,4,5,7,9,10]
 * 解释：
 * 2 = 2^0 + 3^0
 * 3 = 2^1 + 3^0
 * 4 = 2^0 + 3^1
 * 5 = 2^1 + 3^1
 * 7 = 2^2 + 3^1
 * 9 = 2^3 + 3^0
 * 10 = 2^0 + 3^2
 */
public class Test4 {
        public List<Integer> powerfulIntegers(int x, int y, int bound) {
            int i,j,tmpi,tmpj,sum,lasti=-1,lastj=-1;
            List<Integer> array=new ArrayList<>();
            for(i=0;;i++){
                tmpi=(int)Math.pow(x,i);
                if(tmpi>bound){
                    break;
                }
                for(j=0;;j++){
                    tmpj=(int)Math.pow(y,j);
                    sum=tmpi+tmpj;
                    if(tmpi+tmpj>bound){
                        break;
                    }else if(!array.contains(sum)){//List中不包含已有元素,加入
                        array.add(sum);
                    }
                    if(lastj==tmpj){
                        break;
                    }else{
                        lastj=tmpj;
                    }
                }
                if(lasti==tmpi){
                    break;
                }else{
                    lasti=tmpi;//定义边界
                }
            }
            return array;
        }
}
