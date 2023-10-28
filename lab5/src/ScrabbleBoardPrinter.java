public class ScrabbleBoardPrinter {
    public static void printBoard(char[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        printBorder(cols);

        for (int i = 0; i < rows; i++) {
            System.out.print("|");
            for (int j = 0; j < cols; j++) {
                char tile = board[i][j];
                System.out.print(" " + (tile == ' ' ? '.' : tile) + " ");
            }
            System.out.print("|");
            System.out.println();
        }

        printBorder(cols);
    }

    private static void printBorder(int cols) {
        System.out.print("+");
        for (int i = 0; i < cols; i++) {
            System.out.print("---");
        }
        System.out.print("+");
        System.out.println();
    }

    public static void main(String[] args) {
        char[][] board = new char[][] {
                { '-', '.', 'W', '.', '.' },
                { '.', '.', 'O', '.', '.' },
                { '.', '.', 'R', '.', '.' },
                { 'H', 'E', 'L', 'L', 'O' },
                { '.', '.', 'D', '.', '.' }
        };

        ScrabbleBoardPrinter.printBoard(board);
    }
}
