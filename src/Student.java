public class Student {

    Course course1;
    Course course2;
    Course course3;
    double average;
    String name, studentNumber, classes;
    boolean isPass;

    Student(String name, Course course1, Course course2, Course course3, String classes, String studentNumber){
        this.name = name;
        this.course1 = course1;
        this.course2 = course2;
        this.course3 = course3;
        this.classes = classes;
        this.studentNumber = studentNumber;
        this.average = 0.0;
        this.isPass = false;
    }



    void addBulkExamNote(int note1, int note2, int note3){
        if(note1 >= 0 && note1 <= 100){
            course1.note = note1;
        }

        if(note2 >= 0 && note2 <= 100){
            course2.note = note2;
        }

        if(note3 >= 0 && note3 <= 100){
            course3.note = note3;
        }


    }

    void isPass(){
        this.average = (this.course1.note + this.course2.note + this.course3.note) / 3.0;
        if(this.average >= 45){
            System.out.println("Passed!");
            this.isPass = true;
        }else{
            System.out.println("Failed!");
            this.isPass = false;
        }
        printNote();
    }

    void calculateAverage(){

    }

   void printNote(){
       System.out.println("--------------------------------------------------");
       System.out.println(course1.name + " Score:\t" + course1.note);
       System.out.println(course2.name + " Score:\t" + course2.note);
       System.out.println(course3.name + " Score:\t" + course3.note);
    }
}
