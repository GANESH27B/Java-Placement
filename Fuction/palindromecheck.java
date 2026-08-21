import java.util.*;
class palindromecheck{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        String revers = "";
        for(int i=str.length()-1;i>=0;i--){
            revers +=str.charAt(i);
        }
        
        if(str.equals(revers)){
            System.out.println("Is a palindrome string");
        }else {
            System.out.println("Is a not palindrome string");
        }
        
    }
}