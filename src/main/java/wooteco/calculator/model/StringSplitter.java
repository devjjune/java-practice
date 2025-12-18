package wooteco.calculator.model;

public class StringSplitter {
    private String[] splitedInput;

    public StringSplitter(String input) {
        this.splitedInput = splitString(input);
    }

    private String[] splitString(String input) {
        DelimiterFinder delimiterFinder = new DelimiterFinder(input);
        String customDelimiter = delimiterFinder.getCustomDelimiter();

        if (!input.contains("\n")) {
            this.splitedInput = input.split(", | :");
        } else {
            this.splitedInput = input.split(",|:|" + customDelimiter);
        }

        return splitedInput;
    }

    public String[] getSplitedInput() {
        return splitedInput;
    }
}
