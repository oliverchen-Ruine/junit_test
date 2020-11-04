import org.junit.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @version 0.1
 * @Author: oliver chen
 * @Description:
 * @Date:Create：in 2020/11/4 15:56
 * @Modified By：
 */
public class WaterFlowerTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception{
        System.out.println("@BeforeClass");
    }
    @AfterClass
    public static void tearDownAfterClass() throws Exception{
        System.out.println("@AfterClass");
    }
    @Before
    public void setUp() throws Exception {
        System.out.println("测试开始");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("测试结束");
    }

    @Test
    public void resultTest() {
        int [] number= new int[] {153, 370, 371, 407};//153,370,371,407
        int [] testNumber = new int[5];
        WaterFlower waterFlower = new WaterFlower();
        int result,Max=1000,Min=100;
        for(int i:number){
            result=waterFlower.result(i);
            assertEquals("水仙花数计算出错",1,result);
        }
        List<int[]> list = Arrays.asList(number);
        for (int j=0;j<=4;j++){
            do {
                testNumber[j]=(int) (Math.random()*(Max-Min)+Min);
            }while (list.contains(testNumber[j]));
        }
        for(int i:testNumber){
            result=waterFlower.result(i);
            assertEquals("非水仙花数计算出错",0,result);
        }
    }
}