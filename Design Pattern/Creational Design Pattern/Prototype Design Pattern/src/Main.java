public class Main {
    public static void main (String[] args) throws CloneNotSupportedException{
        //load all the backup created
        DeptCache.loadDeptCache();

        Dept clonedEce = DeptCache.getDeptDetails("ECE");
        clonedEce.rank();
        System.out.println("Dept  name : "+ clonedEce.getDeptId());

        Dept clonedCse = DeptCache.getDeptDetails("CSE");
        clonedCse.rank();
        System.out.println("Dept  name : "+ clonedCse.getDeptId());


    }
}