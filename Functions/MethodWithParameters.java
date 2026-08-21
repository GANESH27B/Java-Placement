public class MethodWithParameters {
    static void printStudent(String name, int age) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        printStudent("Ganesh", 21);
    }
}