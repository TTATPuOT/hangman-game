import ScreenBuilderStrategies.SuccessChar;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class GameCoordinator {
    final Scanner scanner = new Scanner(System.in);
    final ScreenBuilder builder = new ScreenBuilder();
    final WordGenerator generator = new WordGenerator();
    final Settings settings = new Settings();
    String word;
    ArrayList<String> errorChars = new ArrayList<>();
    final ArrayList<SuccessChar> successChars = new ArrayList<>();
    GameCoordinatorStrategy strategy = new GameCoordinatorStartStrategy(this);

    public GameCoordinator() throws FileNotFoundException {}

    public void start() {
        while (true) {
            System.out.println(builder.getPresentation());

            String input = readInput();
            strategy.handleInput(input);
        }
    }

    private String readInput() {
        return scanner.nextLine().toUpperCase(Locale.ROOT);
    }
}
