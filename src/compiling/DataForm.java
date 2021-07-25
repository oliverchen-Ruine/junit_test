package compiling;


/**
 * @version 0.1
 * @Author: oliver chen
 * @Description:
 * @Date:Create：in 2021/7/13 11:44
 * @Modified By：
 */
public class DataForm {
    private String entry;
    private Integer val;
    public DataForm(){
        this.entry=null;
        this.val=null;
    }
    public String getEntry() {
        return entry;
    }

    public void setEntry(String entry) {
        this.entry = entry;
    }


    public Integer getVal() {
        return val;
    }

    public void setVal(Integer val) {
        this.val = val;
    }
}
