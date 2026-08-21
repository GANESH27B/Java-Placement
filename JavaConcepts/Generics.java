import java.util.ArrayList;
import java.util.List;

public class Generics {
    static <T> void printItems(List<T> items) {
        for (T item : items) {
            System.out.println(item);
        }
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Java");
        names.add("Collections");
        printItems(names);
    }
}