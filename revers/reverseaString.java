package revers;
import java.util.*;
class reverseaString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        for(int i=str.length()-1;i>=0;i--){
            System.out.print("Reverse of a String " + str.charAt(i));
            
        }
        
        
    }
}