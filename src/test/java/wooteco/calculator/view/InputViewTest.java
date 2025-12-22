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

        assertThatThrownBy(() -> inputView.validateInput(input))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
