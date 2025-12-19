package wooteco.calculator.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringSplitterTest {
    @DisplayName("문자열을 구분자로 분리한다")
    @Test
    void splitString_문자열을_구분자로_분리한다() {
        String input = "//;\n1;2;3";
        String customDelimiter = ";";
        StringSplitter stringSplitter = new StringSplitter(input, customDelimiter);

        String[] result = stringSplitter.getSplitedInput();

        assertThat(result).containsExactly("1", "2", "3");
    }
}
