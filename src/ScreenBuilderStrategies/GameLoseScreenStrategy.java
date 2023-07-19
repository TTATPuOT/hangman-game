package ScreenBuilderStrategies;

public class GameLoseScreenStrategy extends GameWinScreenStrategy {
    public GameLoseScreenStrategy(String word) {
        super(word);
    }

    @Override
    public String getPresentation() {
        return "Вы проиграли. Слово: " + word + " Чтобы начать сначала, напишите Y или N чтобы закончить игру.";
    }
}
