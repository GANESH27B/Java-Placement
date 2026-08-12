import java.util.Scanner;

class repeatedStringMatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string a: ");
        String a = sc.nextLine();
        System.out.print("Enter string b: ");
        String b = sc.nextLine();
        String repeated = "";
        int count = 0;
        while (repeated.length() < b.length()) {
            repeated = repeated + a;
            count++;
        }
        if (repeated.contains(b)) {
            System.out.println("Minimum repetitions: " + count);
        } 
        else {
            repeated = repeated + a;
            count++;

            if (repeated.contains(b)) {
                System.out.println("Minimum repetitions: " + count);
            } 
            else {
                System.out.println("Minimum repetitions: -1");
            }
        }

        sc.close();
    }
}