package wooteco.calculator.view;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class InputViewTest {
    InputView inputView = new InputView();

    @DisplayName("공백을 입력하면 예외가 발생한다")
    @Test
    void validateNotBlank_공백을_입력하면_예외가_발생한다() {
        String input = "  ";

        assertThatThrownBy(() -> inputView.validateInputFormat(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("커스텀 구분자가 두 개 이상이면 예외가 발생한다")
    @Test
    void validateSingleCustomDelimiter_커스텀구분자_개수() {
        String input = "//!;\n1;2;3";

        assertThatThrownBy(() -> inputView.validateInputFormat(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @DisplayName("양의 정수 이외의 문자가 포함되면 예외가 발생한다")
    @Test
    void splitAndValidateNumbers_양의정수이외_예외발생() {
        String input = "//!;\n1;a;-2";
        String customDelimiter = ";";

        assertThatThrownBy(() -> inputView.splitAndValidateNumbers(input, customDelimiter))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
