import ScreenBuilderStrategies.GameLoseScreenStrategy;
import ScreenBuilderStrategies.GameWinScreenStrategy;

public class GameCoordinatorGameOverStrategy extends GameCoordinatorStartStrategy {
    public GameCoordinatorGameOverStrategy(GameCoordinator coordinator) {
        super(coordinator);

        if (coordinator.errorChars.size() >= coordinator.settings.maxErrors) {
            coordinator.builder.setStrategy(new GameLoseScreenStrategy(coordinator.word));
        } else {
            coordinator.builder.setStrategy(new GameWinScreenStrategy(coordinator.word));
        }
    }
}
