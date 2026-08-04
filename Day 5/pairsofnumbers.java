import java.util.*;
public class pairsofnumbers{
    public static void main(String[] args){
        Scanner sc=  new Scanner(System.in);
        System.out.print("Enter the size of a array: ");
        int size = sc.nextInt();
        System.out.print("Enter the  array: ");
        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i] =sc.nextInt();
        }
        for(int i=0 ;i<size;i++){
            for(int j=0;j<size;j++){
                if(arr[i] != arr[j]){
                    System.out.println("(" + arr[i] +"," + arr[j] +")");
                }
                
            
            }
        }
        System.out.println("Array " + Arrays.toString(arr) );
    }
}