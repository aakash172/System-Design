public abstract class Dept implements Cloneable{
    private String deptId;
    protected String deptType;

    public String getDeptId(){
        return deptId;
    }
    public String getDeptType(){
        return deptType;
    }
    public void setDeptId(String deptId){
        this.deptId=deptId;
    }
    public void setDeptType(String deptType){
        this.deptType=deptType;
    }

    abstract void rank();
    protected Object clone() throws CloneNotSupportedException{
        Object clone = null;
        try{
            clone=super.clone();
        }catch(CloneNotSupportedException ex) {
            System.out.println(ex.getStackTrace());
        }
        return clone;
    }
}
