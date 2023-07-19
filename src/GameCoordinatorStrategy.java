public abstract class GameCoordinatorStrategy {
    GameCoordinator coordinator;

    public GameCoordinatorStrategy(GameCoordinator coordinator) {
        this.coordinator = coordinator;
    }

    public void handleInput(String input) {}
}
