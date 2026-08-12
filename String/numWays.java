import java.util.Scanner;

class numWays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter binary string: ");
        String s = sc.nextLine();
        final long MOD = 1000000007;
        int ones = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1') {
                ones++;
            }
        }
        if (ones % 3 != 0) {
            System.out.println(0);
        }
        else if (ones == 0) {
            long n = s.length();
            long answer = ((n - 1) * (n - 2) / 2) % MOD;
            System.out.println(answer);
        }
        else {
            int onesPerPart = ones / 3;
            int count = 0;
            long firstWays = 0;
            long secondWays = 0;
            for (int i = 0; i < s.length(); i++) {

                if (s.charAt(i) == '1') {
                    count++;
                    if (count == onesPerPart) {
                        firstWays = 1;
                        int j = i + 1;
                        while (j < s.length() && s.charAt(j) == '0') {
                            firstWays++;
                            j++;
                        }
                    }
                    if (count == 2 * onesPerPart) {
                        secondWays = 1;
                        int j = i + 1;
                        while (j < s.length() && s.charAt(j) == '0') {
                            secondWays++;
                            j++;
                        }
                        break;
                    }
                }
            }
            long answer = (firstWays * secondWays) % MOD;
            System.out.println(answer);
        }

        sc.close();
    }
}