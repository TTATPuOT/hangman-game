package ScreenBuilderStrategies;

public class SuccessChar {
    private final String symbol;
    public boolean shown = false;

    public SuccessChar(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        if (shown) return symbol;

        return " ";
    }

    public boolean equals(String predict) {
        return this.symbol.equals(predict);
    }
}
