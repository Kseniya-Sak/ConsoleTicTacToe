package consoleTicTacToe.gameLogic;

public class Logic {
    public static final char HUMAN = 'X';
    public static final char COMPUTER = '0';

    private final GameTable gameTable;
    private final GamerStep gamerStep;
    private final ComputerStep computerStep;

    public Logic() {
        this.gameTable = new GameTable();
        this.gamerStep = new GamerStep(HUMAN);
        this.computerStep = new ComputerStep(COMPUTER);
    }

    public void start() {
        System.out.println("A new game started!");
        while (true) {
            gameTable.printGameTable();
            System.out.println("Please enter number from 1 to 9");

            gamerStep.handleHumanTurn();

            if (FindWinner.checkWin(HUMAN, "You win!")) {
                gameTable.printGameTable();
                return;
            }

            computerStep.makeComputerTurn();
            if (FindWinner.checkWin(COMPUTER, "Computer win!")) {
                gameTable.printGameTable();
                return;
            }
        }
    }
}
