package array;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description:
 * @Date:Create：in 2021/7/24 16:30
 * @Modified By：
 */
public class LatestTime {
    /**
     * 1736
     * 给你一个字符串 time ，格式为 hh:mm（小时：分钟），其中某几位数字被隐藏（用 ? 表示）。
     *
     * 有效的时间为 00:00 到 23:59 之间的所有时间，包括 00:00 和 23:59 。
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/latest-time-by-replacing-hidden-digits
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public String maximumTime(String time) {
        String[] str = time.split(":");
        char[] high = str[0].toCharArray();
        char[] low = str[1].toCharArray();
        if (high[0]=='?'&&high[1]!='?'){
            if (Character.getNumericValue(high[1])<=3){
                high[0]='2';
            }else {
                high[0]='1';
            }
        }else if (high[0]=='?'&&high[1]=='?'){
            high[0]='2';
            high[1]='3';
        }else if (high[0]!='?'&&high[1]=='?'){
            if (high[0]=='2'){
                high[1]='3';
            }else {
                high[1]='9';
            }
        }
        if (low[0]=='?'&&low[1]!='?'){
            low[0]='5';
        }else if (low[0]=='?'&&low[1]=='?'){
            low[0]='5';
            low[1]='9';
        }else if (low[0]!='?'&&low[1]=='?'){
            low[1]='9';
        }
        StringBuilder sb = new StringBuilder("");
        String s1 = new String(high);
        String s2 = new String(low);
        sb.append(s1);
        sb.append(':');
        sb.append(s2);
        return sb.toString();
    }
}
