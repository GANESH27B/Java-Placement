import java.util.Scanner;

class SentencesSimilar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sentence 1: ");
        String sentence1 = sc.nextLine();
        System.out.print("Enter sentence 2: ");
        String sentence2 = sc.nextLine();
        String[] a = sentence1.split(" ");
        String[] b = sentence2.split(" ");

        if (a.length < b.length) {
            String[] temp = a;
            a = b;
            b = temp;
        }

        int left = 0;
        while (left < b.length && a[left].equals(b[left])) {
            left++;
        }
        int right = 0;
        while (right < b.length - left &&
               a[a.length - 1 - right].equals(b[b.length - 1 - right])) {
            right++;
        }
        if (left + right >= b.length) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        sc.close();
    }
}