import ScreenBuilderStrategies.GameScreenStrategy;
import ScreenBuilderStrategies.SuccessChar;

import java.util.List;

public class GameCoordinatorGameplayStrategy extends GameCoordinatorStrategy {
    public GameCoordinatorGameplayStrategy(GameCoordinator coordinator) {
        super(coordinator);

        coordinator.builder.setStrategy(new GameScreenStrategy(coordinator.successChars, coordinator.errorChars));
    }

    public void handleInput(String input) {
        List<SuccessChar> foundChars = coordinator.successChars.stream().filter(successChar -> successChar.equals(input)).toList();

        if (foundChars.size() > 0) {
            for (SuccessChar successChar: foundChars) {
                successChar.shown = true;
            }
            if (coordinator.successChars.stream().allMatch(successChar -> successChar.shown)) {
                coordinator.strategy = new GameCoordinatorGameOverStrategy(coordinator);
            }
        } else if (coordinator.errorChars.stream().noneMatch(c -> c.equals(input))) {
            coordinator.errorChars.add(input);
        }

        if (coordinator.errorChars.size() >= coordinator.settings.maxErrors) {
            coordinator.strategy = new GameCoordinatorGameOverStrategy(coordinator);
        }
    }
}
