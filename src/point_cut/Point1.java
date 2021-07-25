package point_cut;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description: 交点
 * @Date:Create：in 2021/7/15 9:51
 * @Modified By：
 */

public class Point1 {

    /**
     * 给定两条线段（表示为起点start = {X1, Y1}和终点end = {X2, Y2}）
     * 如果它们有交点，请计算其交点，没有交点则返回空值。
     * 要求浮点型误差不超过10^-6
     */
    private static final double E=1e-6;
    private static final double[] isnull={};

    public double[] intersection(int[] start1, int[] end1, int[] start2, int[] end2) {
        int x1=start1[0],x2=end1[0],y1=start1[1],y2=end1[1];
        int x3=start2[0],x4=end2[0],y3=start2[1],y4=end2[1];
        /**
         * 已知直线上两点求直线的一般式方程
         * AX+BY+C=0的一般式方程就是：
         * A = Y2 - Y1
         * B = X1 - X2
         * C = X2*Y1 - X1*Y2
         */
        int A1=y2-y1,B1=x1-x2,C1=x2*y1-x1*y2;
        int A2=y4-y3,B2=x3-x4,C2=x4*y3-x3*y4;
        /**
         * 线性代数知识求两方程解
         * a11*x1+a12*x2​=b1​
         * a21*x1+a22*x2​=b2​
         * D=|a11  a12|
         *   |a21  a22|
         *  =a11*a22*−a12*a21系数矩阵
         * D1=|b1  a12|
         *    |b2  a22|
         * =b1*a22−a12*b2
         * D2=|b1  a11|
         *    |b2  a21|
         * =a11*b2−b1*a21​
         * 当D！=0时，方程有唯一解
         * x1=D1/D  x2=D2/D​​
         */
        int a11=A1,a12=B1,b1=-C1;
        int a21=A2,a22=B2,b2=-C2;
        int D=a11*a22-a12*a21,D1=b1*a22-a12*b2,D2=a11*b2-b1*a21;
        if (D!=0){//不平行
            double x=D1/(double)D,y=D2/(double)D;//交点
            double[] result={x,y};
            if (isInLine(x,x1,x2)&&isInLine(x,x3,x4)&&isInLine(y,y1,y2)&&isInLine(y,y3,y4)){
                return result;
            }
        }
        if (D==0&&D1==0){//平行
            if (Math.max(x1,x2)<Math.min(x3,x4)||Math.min(x1,x2)>Math.max(x3,x4))return isnull;
            if (Math.max(y1,y2)<Math.min(y3,y4)||Math.min(y1,y2)>Math.max(y3,y4))return isnull;

            int[][] ints={{x1,y1},{x2,y2},{x3,y3},{x4,y4}};
            Arrays.sort(ints, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    if (o1[0]==o2[0]) return o1[1]-o2[1];//如果第一个元素相同比较第二个
                    return o1[0]-o2[0];
                }
            });
            double[] doubles={(double)ints[1][0],(double)ints[1][1]};
            return doubles;
        }
        return isnull;
    }
    private boolean isInLine(double x,double start,double end){
        if (Math.abs(x-start)<E||Math.abs(x-end)<E)return true;//精度确认
        return (x-start>0&&end-x>0)||(x-end>0&&start-x>0);
    }
}
