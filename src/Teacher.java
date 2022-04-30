public class Teacher {
    String name, phone, branch;

    Teacher(String name, String phone, String branch){
        this.name = name;
        this.phone = phone;
        this.branch = branch;
    }

    void print(){
        System.out.println("Teacher's name: " + this.name);
        System.out.println("Teacher's phone : " + this.phone);
        System.out.println("Branch: " + this.branch);
    }
}
