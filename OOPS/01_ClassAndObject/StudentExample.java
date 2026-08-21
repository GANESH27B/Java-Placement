class OopsStudent {
    String name;

    void study() {
        System.out.println(name + " is studying Java");
    }
}

public class StudentExample {
    public static void main(String[] args) {
        OopsStudent firstStudent = new OopsStudent();
        firstStudent.name = "Ganesh";
        firstStudent.study();
    }
}