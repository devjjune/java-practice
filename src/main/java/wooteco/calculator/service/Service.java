package wooteco.calculator.service;

import wooteco.calculator.model.Calculator;
import wooteco.calculator.model.DelimiterFinder;
import wooteco.calculator.model.NumberParser;
import wooteco.calculator.model.StringSplitter;

import java.util.List;

public class Service {
    public int parseInput(String input) {
        DelimiterFinder delimiterFinder = new DelimiterFinder(input);
        String customDelimiter = delimiterFinder.getCustomDelimiter();

        StringSplitter stringSplitter = new StringSplitter(input, customDelimiter);
        String[] splitedInput = stringSplitter.getSplitedInput();

        NumberParser numberParser = new NumberParser();
        List<Integer> numbers = numberParser.parse(splitedInput);

        Calculator calculator = new Calculator();
        return calculator.sum(numbers);

    }
}
