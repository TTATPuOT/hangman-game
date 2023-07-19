import ScreenBuilderStrategies.SuccessChar;

import java.util.Random;

public class GameCoordinatorStartStrategy extends GameCoordinatorStrategy {
    public GameCoordinatorStartStrategy(GameCoordinator coordinator) {
        super(coordinator);
    }

    public void handleInput(String input) {
        if (input.equals("Y")) {
            startGame();
        } else if (input.equals("N")) {
            exitGame();
        }
    }

    private void startGame() {
        coordinator.word = coordinator.generator.getRandomWord();

        coordinator.errorChars.clear();
        coordinator.successChars.clear();
        for (char symbol: coordinator.word.toCharArray()) {
            coordinator.successChars.add(new SuccessChar(String.valueOf(symbol)));
        }

        Random random = new Random();
        while (coordinator.successChars.stream().filter(successChar -> successChar.shown).count() < coordinator.settings.startOpenedChars) {
            int index = random.nextInt(coordinator.successChars.size());
            coordinator.successChars.get(index).shown = true;
        }

        coordinator.strategy = new GameCoordinatorGameplayStrategy(coordinator);
    }

    private void exitGame() {
        coordinator.scanner.close();
        System.exit(0);
    }
}
