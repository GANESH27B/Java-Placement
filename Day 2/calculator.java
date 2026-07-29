import java.util.*;
public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter one numbers num1: ");
        int num1 =sc.nextInt();
        System.out.println("Enter two numbers num2: ");
        int num2 = sc.nextInt();
        System.out.println("Enter the operation: ");
        char op = sc.next().charAt(0);
        if(op == '+'){
            System.out.println("add of two " + num1 + num2);

        } else if(op == '-'){
            System.out.println("sub of two " + (num1 - num2));

        } else if(op == '*'){
            System.out.println("mul of two " + num1 * num2);

        } else if(op == '/'){
            System.out.println("div of two " + num1 / num2);

        } else if(op == '%'){
            System.out.println("mod of two" + num1 % num2);   
        }else{
            System.out.println("Invalid operation");
        }
    }
}
