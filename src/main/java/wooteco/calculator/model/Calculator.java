package wooteco.calculator.model;

import java.util.List;

public class Calculator {
    public int sum(List<Integer> numbers) {
        int result = 0;
        for (int number : numbers) {
            result += number;
        }
        return result;
    }
}
