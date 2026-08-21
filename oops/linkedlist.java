import java.util.*;

public class linkedlist {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        list.addFirst("Start");
        list.addLast("End");

        System.out.println(list);

        list.removeFirst();
        list.removeLast();

        System.out.println(list);

        for (String s : list) {
            System.out.println(s);
        }
    }
}