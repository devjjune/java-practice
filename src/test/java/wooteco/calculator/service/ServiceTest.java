package wooteco.calculator.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ServiceTest {
    @Test
    @DisplayName("문자열을 파싱한다")
    void parseInput_문자열을_파싱한다() {
        Service service = new Service();
        String input = "//;\n1;2;3";

        int result = service.parseInput(input);

        assertThat(result).isEqualTo(6);
    }
}
