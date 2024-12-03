public class SchoolStudent{
    private String name;
    private  String surName;
    private String email;
    public SchoolStudent(String name,String surName,String email){
        this.name=name;
        this.surName=surName;
        this.email=email;
    }
    public String getName() {
        return this.name;
    }
    public String getSurName() {
        return this.surName;
    }
    public String getEmail() {
        return this.email;
    }
}
