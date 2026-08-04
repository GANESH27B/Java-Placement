limport java.util.*;
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
        Arrays.sort(arr);
        System.out.println("small " + arr[1]);
        System.out.println("large " + arr[size-2]);
        System.out.println("Array " + Arrays.toString(arr) );
       
    }
}