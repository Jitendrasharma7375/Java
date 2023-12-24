import java.util.ArrayList;
import java.util.List;

public class Course {
    private String name;
    private String instructor;
    private List <String> StudentEnroll;
    Course(String name,String instructor)
    {
        this.name=name;
        this.instructor=instructor;
        this.StudentEnroll=new ArrayList<>();
    }
    public String getName()
    {
        return name;
    }
    public String getInstructor()
    {
        return instructor;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setInstructor(String instructor)
    {
        this.instructor=instructor;
    }
    public void addStudent(String studentName)
    {
        StudentEnroll.add(studentName);
    }
    public void removeStudent(String studentName)
    {
        StudentEnroll.remove(studentName);
    }
    public List<String> getEnrolledStudent()
    {
        return StudentEnroll;
    }
    public static void main(String[] args) {
        Course c=new Course("Jitendra Sharma", "Dholu");
        System.out.println("Name:"+c.getName());

        c.setName("Kaluu");
        System.out.println("Name:"+c.getName());

        System.out.println("Instructor:"+c.getInstructor());

        c.addStudent("Mohit");
        c.addStudent("Yadav");
        System.out.println("Name:"+c.getEnrolledStudent());

        c.removeStudent("Yadav");
        System.out.println("Name:"+c.getEnrolledStudent());
    }
}
