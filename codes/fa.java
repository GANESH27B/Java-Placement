// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int num = sc.nextInt();
        for(int i=1; i<= num; i++){
            if(num % i == 0 ){
                System.out.println("Divisible by the " + i);
            }
        }
    }
}