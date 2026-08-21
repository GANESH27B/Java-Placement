import java.util.*;
class lettercontaink{
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
        System.out.println("result");
        for(int i=0; i<size;i++){
            for(int j=0;j<al.get(i).length();j++){
                if(al.get(i).charAt(j) == 'k') {
                    System.out.println(al.get(i));
                }
            }
        }

    }
}