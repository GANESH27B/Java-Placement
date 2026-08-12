import java.util.*;
class pow{
    double p(double x, int n){
        if (n == 0) {
            return 1;
        }

        return x * p(x, n - 1);
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the x: ");
        double x =sc.nextDouble();
        System.out.println("Enter the n : ");
        int n =sc.nextInt();
        word po =new word();
        System.out.println(po.p(x,n));
    }
}