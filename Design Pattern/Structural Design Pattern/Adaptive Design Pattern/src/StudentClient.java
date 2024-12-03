import java.util.ArrayList;
import java.util.List;

public class StudentClient {
    public List<Student>getStudentList(){
        List<Student>students=new ArrayList<>();
        CollegeStudent collegeStudent=new CollegeStudent("Akash","Chaudhary","aakash172@gmail.com");
        SchoolStudent schoolStudent =new SchoolStudent("Akash","Chaudhary","aakash172@gmail.com");
        students.add(collegeStudent);
        students.add(new SchoolStudentAdaptor(schoolStudent));


        return  students;
    }
}
