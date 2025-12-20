package wooteco.calculator.model;

import java.util.ArrayList;
import java.util.List;

public class NumberParser {
    public List<Integer> parse(String[] splitedInput) {
        List<Integer> numbers = new ArrayList<>();
        for (String letter : splitedInput) {
            numbers.add(Integer.parseInt(letter));
        }
        return numbers;
    }
}
