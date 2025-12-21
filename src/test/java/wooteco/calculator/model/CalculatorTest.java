package wooteco.calculator.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {
    @Test
    @DisplayName("숫자를 더한다")
    void sum_숫자를_더한다() {
        List<Integer> numbers = new ArrayList<>(List.of(1, 2, 3));
        Calculator calculator = new Calculator();

        int result = calculator.sum(numbers);

        assertThat(result).isEqualTo(6);
    }
}
