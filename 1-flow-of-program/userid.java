import java.util.*;
public class userid {
  public static void mian(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter userid : ");
    String useid = sc.nextln();
    System.out.println("Enter password : ");
    String pass = sc.nextln();
    if((useid == "Ganesh") && (pass == "123456")){
        System.out.println("Welcome to Home");
    }else if((useid == "Ganesh") && (pass != "123456") ){
        System.out.println("Password is invaild");
    }
    else if((useid != "Ganesh") && (pass == "123456")){
         System.out.println("User id is invaild");
    }else{
         System.out.println("User id and Password is invaild");
    }
  }  
}
