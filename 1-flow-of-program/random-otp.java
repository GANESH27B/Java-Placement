import java.util.*;

public class random-otp {
    public static void main(String[] args) {
        Random num = new Random();
        int x = num.nextInt(10000);
        System.out.println((x%2 == 0) ? x +" Even" : x + " Odd");


    }
}