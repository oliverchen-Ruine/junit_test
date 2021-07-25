package compiling;
/**
 * @version 0.1
 * @Author: oliver chen
 * @Description: 预测分析和抽象语法树函数入口
 * @Date:Create：in 2021/7/13 9:35
 * @Modified By：
 */
import java.io.IOException;
import java.util.List;
import java.util.Map;
public class MainFun {

    public static void main(String[] args) throws IOException {
        String path="E:\\projrct\\junit_test\\src\\compiling\\grammar";
        String grammar= Fun.readGrammarFile(path);
        System.out.println("文法如下：");
        List<String> oldList=Fun.getGrammar(grammar);
        System.out.println(oldList);
        System.out.println("文法的每一条产生式如下：");
        List<String> oldListItems=Fun.getGrammarItems(grammar);
        System.out.println(oldListItems);
        System.out.println("所有非终结符号如下：");
        List<String> vn=Fun.getVN(grammar);
        System.out.println(vn);
        System.out.println("文法的终结符号如下：");
        List<String> vt=Fun.getVT(oldListItems);
        System.out.println(vt);
        System.out.println("消除左递归后的文法如下：");
        List<String> newList=Fun.removeLeftRecursive(oldListItems);
        System.out.println(newList);
        StringBuilder stringBuilder=new StringBuilder();
        for(int i=0;i<newList.size();i++){
            stringBuilder.append(newList.get(i)+"\n");
        }
        System.out.println("消除左递归后的文法的非终结符号如下：");
        vn=Fun.getVN(stringBuilder.toString());
        System.out.println(vn);
        System.out.println("消除左递归后的文法的终结符号如下：");
        vt=Fun.getVT(newList);
        System.out.println(vt);
        System.out.println("first集合如下：");
        Map<String,List<String>> firstList=Fun.getFirst(vn, newList);
        System.out.println(firstList);
        System.out.println("follow集合如下：");
        Map<String,List<String>> followList=Fun.getFollow(vn, newList, firstList);
        System.out.println(followList);
        System.out.println("该文法是LL（1）文法吗？"+Fun.isLL1(firstList, followList, newList, vn));
        if(Fun.isLL1(firstList, followList, newList, vn)){
            System.out.println("预测分析表如下：");
            Fun.print(vn, vt,firstList,followList,newList);
        }
        vt=Fun.getVT(newList);
        Fun.analyse(vn,vt,vn.get(0));
    }
}
