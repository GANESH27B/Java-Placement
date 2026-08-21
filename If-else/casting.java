import java.util.*;

public class casting {
    public static void main(String[] args) {
        Random num = new Random();
        int x = num.nextInt(100);
        double y = x;
        float z = x;
        System.out.println(y);
        
        System.out.println(y.typeof());



    }
}