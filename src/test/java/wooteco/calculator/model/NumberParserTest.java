package wooteco.calculator.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class NumberParserTest {
    @DisplayName("문자열을 숫자로 바꾼다")
    @Test
    void parse_문자열을_숫자로_바꾼다() {
        String[] splitedInput = {"1", "2", "3"};
        NumberParser numberParser = new NumberParser(splitedInput);

        List<Integer> result = numberParser.getNumbers();

        assertThat(result).containsExactly(1, 2, 3);
    }
}
