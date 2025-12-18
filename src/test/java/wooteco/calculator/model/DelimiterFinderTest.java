package wooteco.calculator.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class DelimiterFinderTest {
    @DisplayName("커스텀 구분자를 찾는다")
    @Test
    void findDelimiter_커스텀구분자를_찾는다() {
        String input = "//;\n1;2;3";
        DelimiterFinder delimiterFinder = new DelimiterFinder(input);

        String result = delimiterFinder.getCustomDelimiter();

        assertThat(result).isEqualTo(";");
    }
}
