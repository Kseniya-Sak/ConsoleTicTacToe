package consoleTicTacToe.gameLogic;

import java.util.Scanner;

// ход игрока
public class GamerStep extends Step {

    public GamerStep(char gamerSymbol) {
        super(gamerSymbol);
    }

    // чтение хода игрока
    private int readHumanTurn() {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int index = 0;
            if (scanner.hasNextInt()) {
                index = scanner.nextInt();
            } else {
                System.out.println("It's not a number");
                System.out.println("Please enter number from 1 to 9");
                continue;
            }

            if (index < 1 || index > 9) {
                System.out.println("Number should be between 1 and 9");
            } else if (isCellFree(index)) {
                return index;
            } else {
                System.out.println("Cell is not free! Enter other number ");
            }
        }
    }

    // обработка хода игрока
    public void handleHumanTurn() {
        makeTurn(readHumanTurn(), getGamerSymbol());
    }


}
