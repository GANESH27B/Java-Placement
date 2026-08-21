class EncapsulatedStudent {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class PrivateFieldExample {
    public static void main(String[] args) {
        EncapsulatedStudent student = new EncapsulatedStudent();
        student.setName("Ganesh");
        System.out.println(student.getName());
    }
}