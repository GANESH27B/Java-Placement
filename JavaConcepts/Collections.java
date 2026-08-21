import java.util.ArrayList;
import java.util.HashMap;

public class Collections {
    public static void main(String[] args) {
        ArrayList<String> languages = new ArrayList<>();
        languages.add("Java");
        languages.add("Python");

        HashMap<Integer, String> students = new HashMap<>();
        students.put(1, "Ganesh");
        students.put(2, "Rahul");

        System.out.println("Languages: " + languages);
        System.out.println("Student with ID 1: " + students.get(1));
    }
}