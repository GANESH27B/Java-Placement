import java.util.*;

public class wordsearch {

    static boolean search(char[][] board, String word,
                          int row, int col, int index) {
        if (index == word.length()) {
            return true;
        }
        if (row < 0 || row >= board.length ||
            col < 0 || col >= board[0].length) {
            return false;
        }
        if (board[row][col] != word.charAt(index)) {
            return false;
        }
        char temp = board[row][col];
        board[row][col] = '#';
        boolean found =
                search(board, word, row - 1, col, index + 1) ||
                search(board, word, row + 1, col, index + 1) ||
                search(board, word, row, col - 1, index + 1) ||
                search(board, word, row, col + 1, index + 1);

        board[row][col] = temp;
        return found;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int m = sc.nextInt();
        System.out.print("Enter columns: ");
        int n = sc.nextInt();
        char[][] board = new char[m][n];
        System.out.println("Enter the characters:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = sc.next().charAt(0);
            }
        }
        System.out.print("Enter word: ");
        String word = sc.next();
        boolean result = false;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (search(board, word, i, j, 0)) {
                    result = true;
                    break;
                }
            }
            if (result) {
                break;
            }
        }
        System.out.println("Result: " + result);
        sc.close();
    }
}