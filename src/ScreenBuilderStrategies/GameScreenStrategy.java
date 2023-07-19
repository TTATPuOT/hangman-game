package ScreenBuilderStrategies;

import ScreenBuilderStrategies.Drawers.CharBox;
import ScreenBuilderStrategies.Drawers.GallowDrawer;

import java.util.ArrayList;

public class GameScreenStrategy implements ScreenBuilderStrategy {
    private final ArrayList<SuccessChar> successChars;
    private final ArrayList<String> errorChars;

    public GameScreenStrategy(ArrayList<SuccessChar> successChars, ArrayList<String> errorChars) {
        this.successChars = successChars;
        this.errorChars = errorChars;
    }

    @Override
    public String getPresentation() {
        StringBuilder result = new StringBuilder(GallowDrawer.getAscii(errorChars.size()));

        for (SuccessChar successChar: successChars) {
            result.append(CharBox.getAscii(successChar.getSymbol()));
        }

        result.append("\nИсключённые буквы: ");
        result.append(String.join(", ", errorChars));

        return result.toString();
    }
}
