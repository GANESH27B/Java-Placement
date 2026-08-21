import java.util.*;

public class arraylist {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Python");
        list.add("C++");

        System.out.println(list);

        System.out.println(list.get(1));

        list.set(1, "JavaScript");

        list.remove(0);

        for (String s : list) {
            System.out.println(s);
        }
    }
}