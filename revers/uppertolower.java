package revers;
import java.util.*;
class uppertolower{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        for(int i=0;i<str.length() ; i++){
            if(Character.isUpperCase(str.charAt(i))){
                char ch = Character.toLowerCase(str.charAt(i));
                System.out.print(ch);
            }else{
                char ch = Character.toUpperCase(str.charAt(i));
                System.out.print(ch);
            }
        }
        
    }
}