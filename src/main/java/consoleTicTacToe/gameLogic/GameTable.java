package consoleTicTacToe.gameLogic;

public class GameTable {
    private static final char EMPTY = ' ';

    public static final char[][] TABLE;

    static {
        TABLE = new char[3][3];
        for (int i = 0; i < TABLE.length; i++) {
            for (int j = 0; j < TABLE[i].length; j++) {
                TABLE[i][j] = EMPTY;
            }
        }
    }

    public void printGameTable() {
        int size = TABLE.length * 2 - 1;
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                if (row % 2 == 0) {
                    printPartGabeTable(col, " " + TABLE[row / 2][col / 2] + " ", "|");
                } else {
                    printPartGabeTable(col, "---", "-");
                }
            }
            System.out.println();
        }
    }

    private void printPartGabeTable(int col, String str1, String str2) {
        if (col % 2 == 0) {
            System.out.print(str1);
        } else {
            System.out.print(str2);
        }
    }
}
