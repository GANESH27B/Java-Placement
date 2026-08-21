import java.util.*;
public class amoutnotes {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter amount: ");
        int amount = sc.nextInt();
    
        int am = 0;
        int n500 = 0;
        int n200 = 0;
        if(amount >=500){
            int am1 = amount % 500;
            am += am1;
            int n1 = amount / 500;
            n500 += n1;
        }
        

        System.out.println("remin amount" + am);
        System.out.println(n500);
        

    }
}
