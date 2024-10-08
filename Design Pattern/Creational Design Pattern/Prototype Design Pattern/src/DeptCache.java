import java.util.Hashtable;

public class DeptCache {
    private static Hashtable<String,Dept>deptHashtable=new Hashtable<>();

    public static Dept getDeptDetails(String deptId) throws CloneNotSupportedException {
        Dept cacheDept = deptHashtable.get(deptId);
        return (Dept) cacheDept.clone();
    }

    public static void loadDeptCache(){
        CSE cse = new CSE();
        cse.setDeptId("CSE");
        deptHashtable.put(cse.getDeptId(),cse);

        ECE ece = new ECE();
        ece.setDeptId("ECE");
        deptHashtable.put(ece.getDeptId(),ece);

    }
}
