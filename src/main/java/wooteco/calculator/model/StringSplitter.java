package wooteco.calculator.model;

import java.util.regex.Pattern;

public class StringSplitter {
    private String[] splitedInput;

    public StringSplitter(String input, String customDelimiter) {
        this.splitedInput = splitString(input, customDelimiter);
    }

    private String[] splitString(String input, String customDelimiter) {
        if (input.startsWith("//") && input.contains("\n")) {
            String numbersPart = input.substring(input.indexOf("\n") + 1);
            this.splitedInput = numbersPart.split(",|:|" + Pattern.quote(customDelimiter));
        } else {
            this.splitedInput = input.split(",|:|");
        }

        return splitedInput;
    }

    public String[] getSplitedInput() {
        return splitedInput;
    }
}
