package ScreenBuilderStrategies.Drawers;

public class CharBox implements DrawerInterface {
    public static String getAscii(String symbol) {
        return "[" + symbol + "]";
    }
}
