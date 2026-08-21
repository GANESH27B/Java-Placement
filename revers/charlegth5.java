package revers;
import java.util.*;
class charlength5{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size =sc.nextInt();
        sc.nextLine();
        System.out.println("Enter the string: ");
        ArrayList<String> al = new ArrayList<>();
        for(int i=0;i<size;i++){
            al.add(sc.nextLine());
        }
        for(int i=0; i<size;i++){
            if(al.get(i).length() == 5){
                System.out.println(al.get(i));
            }
        }
        System.out.println(al);
    }
}