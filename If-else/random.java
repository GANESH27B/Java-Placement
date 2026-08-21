import java.util.*;

public class random {
    public static void main(String[] args) {
        Random num = new Random();
        int x = num.nextInt(100);
        System.out.println((x%2 == 0) ? x +" Even" : x + " Odd");


    }
}