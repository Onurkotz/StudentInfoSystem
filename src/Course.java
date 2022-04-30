import java.time.temporal.TemporalAccessor;

public class Course {

    Teacher teacher;
    String name, prefix, code;
    int note;

    Course(String name, String prefix, String code, Teacher teacher){
        this.name = name;
        this.prefix = prefix;
        this.code = code;
        this.teacher = teacher;
        int note = 0;
    }

    void addTeacher(Teacher teacher){
        if(teacher.branch.equals(this.prefix)){
            this.teacher = teacher;
            printTeacher();
        }else{
            System.out.println("Teacher and branch is not match!");
        }
    }

    void printTeacher(){
        this.teacher.print()
    }
}
