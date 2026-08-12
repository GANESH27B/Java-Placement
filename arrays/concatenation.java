import java.util.*;

class concatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int[] a1 = new int[size];
        System.out.println("Enter the array1:");
        for (int i = 0; i < size; i++) {
            a1[i] = sc.nextInt();
        }
        int[] a2 = new int[size];
        System.out.println("Enter the array2:");
        for (int i = 0; i < size; i++) {
            a2[i] = sc.nextInt();
        }
        int[] a3 = new int[size + size];
        for(int i=0;i<size;i++){
            a3[i] = a1[i];
            a3[size+i] = a2[i];
        }
        System.out.print(Arrays.toString(a3));
        
    }
}