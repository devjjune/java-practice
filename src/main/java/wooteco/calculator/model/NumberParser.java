package wooteco.calculator.model;

import java.util.List;

public class NumberParser {
    private List<Integer> numbers;

    public NumberParser(String[] splitedInput) {
        this.numbers = parse(splitedInput);
    }

    private List<Integer> parse(String[] splitedInput) {
        for (String letter : splitedInput) {
            numbers.add(Integer.parseInt(letter));
        }
        return numbers;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }
}
