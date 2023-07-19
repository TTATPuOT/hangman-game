import java.io.FileNotFoundException;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        GameCoordinator coordinator = new GameCoordinator();
        coordinator.start();
    }
}