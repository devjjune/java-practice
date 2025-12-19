package wooteco.calculator.service;

import wooteco.calculator.model.DelimiterFinder;
import wooteco.calculator.model.StringSplitter;

public class Service {
    private void parseInput(String input) {
        DelimiterFinder delimiterFinder = new DelimiterFinder(input);
        String customDelimiter = delimiterFinder.getCustomDelimiter();

        StringSplitter stringSplitter = new StringSplitter(input, customDelimiter);
        String[] splitedInput = stringSplitter.getSplitedInput();
    }
}
