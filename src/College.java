import java.util.ArrayList;

public class College {
    private ArrayList<Student> students;

    public College() {
        students = new ArrayList();
    }

    public  void addStudent(Student s){
        students.add(s);
    }

    public void printAllData(){
        for(Student s: students){
            System.out.println(s.getName());
            System.out.println(s.getAge());
            System.out.println(s.getAddress());
            System.out.println(s.getPhone());
            System.out.println("-------");
        }
    }
}
