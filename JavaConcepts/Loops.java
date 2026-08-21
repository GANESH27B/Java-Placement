public class Loops {
    public static void main(String[] args) {
        for (int number = 1; number <= 5; number++) {
            System.out.print(number + " ");
        }
        System.out.println();

        int count = 3;
        while (count > 0) {
            System.out.println("While count: " + count);
            count--;
        }

        int value = 1;
        do {
            System.out.println("Do-while value: " + value);
            value++;
        } while (value <= 2);
    }
}