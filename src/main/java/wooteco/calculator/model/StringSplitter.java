package wooteco.calculator.model;

import java.util.regex.Pattern;

public class StringSplitter {
    private String[] splitedInput;

    public StringSplitter(String input, String customDelimiter) {
        this.splitedInput = splitString(input, customDelimiter);
    }

    private String[] splitString (String input, String customDelimiter) {
        if (input.startsWith("//") && input.contains("\n")) {
            String numbersPart = input.substring(input.indexOf("\n") + 1);
            return numbersPart.split(",|:|" + Pattern.quote(customDelimiter));
        } else {
            return input.split("[,:]");
        }
    }

    public String[] getSplitedInput() {
        return splitedInput;
    }
}
