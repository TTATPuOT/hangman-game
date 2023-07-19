import ScreenBuilderStrategies.ScreenBuilderStrategy;
import ScreenBuilderStrategies.WelcomeScreenStrategy;

public class ScreenBuilder implements ScreenBuilderStrategy {
    private ScreenBuilderStrategy strategy = new WelcomeScreenStrategy();

    public void setStrategy(ScreenBuilderStrategy strategy) {
        this.strategy = strategy;
    }

    @Override
    public String getPresentation() {
        return "=========\n" + strategy.getPresentation() + "\n=========";
    }
}
