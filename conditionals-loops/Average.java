import java.util.*;
class Average{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int sum =0;
        for(int i=1;i<=n;i++){
            sum +=i;
        }
        double ave=(double) sum/n;
        System.out.printf("Average: %.2f",  ave );
    }
}