import java.util.*;
class vowelandConsonant{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        int vowels =0;
        int conso  = 0;
        for(int i=0;i<str.length();i++){
            char l= str.charAt(i);
            if(l == 'a' || l == 'e' || l == 'i' || l == 'o' ||  l == 'u' ){
                vowels += 1;
                
            }else {
                conso += 1;
            }
        }
        System.out.println("vowels : " + vowels);
        System.out.println("consonants : " + conso);

        
    }
}