package wooteco.calculator.model;

public class DelimiterFinder {
    private String customDelimiter;

    public DelimiterFinder(String input) {
        this.customDelimiter = findDelimiter(input);
    }

    private String findDelimiter(String input) {
        int frontIndex = input.indexOf("//");
        int lastIndex = input.indexOf("\n");

        return input.substring(frontIndex + 2, lastIndex);
    }

    public String getCustomDelimiter() {
        return customDelimiter;
    }
}
