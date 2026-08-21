package revers;
import java.util.*;
class removespace{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        String chart = "";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == ' '){
                
            }else{
                chart +=str.charAt(i);
            }
    
        }
        System.out.print("Final : " + chart);

        
    }
}