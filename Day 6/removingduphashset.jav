import java.util.*;
class removingduphashset{
    public static void main(String[] args){
        Scanner sc =new  Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        System.out.println("Enter the numbers: ");
        HashSet<Integer> has = new HashSet<>();
        for(int i=0;i<size;i++){
             has.add(sc.nextInt());
        }
        System.out.println(has);
    }
}