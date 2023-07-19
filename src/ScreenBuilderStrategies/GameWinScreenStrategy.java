package ScreenBuilderStrategies;

public class GameWinScreenStrategy implements ScreenBuilderStrategy {
    protected String word;

    public GameWinScreenStrategy(String word) {
        this.word = word;
    }

    public String getPresentation() {
        return "Вы выиграли! Слово: " + word + ". Чтобы начать сначала, напишите Y или N чтобы закончить игру.";
    }
}
