package ScreenBuilderStrategies;

public class WelcomeScreenStrategy implements ScreenBuilderStrategy {
    @Override
    public String getPresentation() {
        return "Добро пожаловать в игру «Висельница»!. Чтобы начать, введите Y. Чтобы выйти, введите N.";
    }
}
