package wooteco.calculator.view;

import java.util.Scanner;

public class InputView {
    private static final String INPUT_MESSAGE = "덧셈할 문자열을 입력해 주세요.";

    public static String readInput() {
        System.out.println(INPUT_MESSAGE);
        Scanner scanner = new Scanner(System.in);

        String first = scanner.nextLine();

        if (first.startsWith("//")) {
            String second = scanner.nextLine();
            return first + "\n" + second;
        }

        return first;
    }

    public void validateInput(String input) {
        validateNotBlank(input);
    }

    private void validateNotBlank(String input) {
        if (input.isBlank()) {
            throw new IllegalArgumentException("입력값이 비어있습니다.");
        }
    }

}
