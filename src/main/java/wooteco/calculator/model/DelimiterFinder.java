package wooteco.calculator.model;

public class DelimiterFinder {
    private String customDelimiter;

    public DelimiterFinder(String input) {
        this.customDelimiter = findDelimiter(input);
    }

    private String findDelimiter(String input) {
        if (input.startsWith("//") || input.contains("\n")) {
            this.customDelimiter = input.substring(2, input.indexOf("\n"));
        }
        return customDelimiter;
    }

    public String getCustomDelimiter() {
        return customDelimiter;
    }
}
