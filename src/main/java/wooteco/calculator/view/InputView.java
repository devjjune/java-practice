package wooteco.calculator.view;

import wooteco.calculator.model.StringSplitter;

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
        validateSingleCustomDelimiter(input);

        String[] tokens = StringSplitter(input);
        validatePositiveNumbers(tokens);
    }

    private void validateNotBlank(String input) {
        if (input.isBlank()) {
            throw new IllegalArgumentException("입력값이 비어있습니다.");
        }
    }

    private void validateSingleCustomDelimiter(String input) {
        if (!input.startsWith("//")) {
            return;
        }

        int delimiterStartIndex = 2;
        int delimiterEndIndex = input.indexOf("\n");

        if (delimiterEndIndex == -1) {
            throw new IllegalArgumentException("커스텀 구분자 형식이 올바르지 않습니다.");
        }

        String delimiterPart = input.substring(delimiterStartIndex, delimiterEndIndex);

        if (delimiterPart.length() != 1) {
            throw new IllegalArgumentException("커스텀 구분자는 1개만 허용됩니다.");
        }
    }

    private void validatePositiveNumbers(String[] splitedInput) {
        for (String letter : splitedInput) {
            try {
                int number = Integer.parseInt(letter);
                if (number <= 0) {
                    throw new IllegalArgumentException("양의 정수만 입력할 수 있습니다.");
                }
            } catch (NumberFormatException e) {
                throw new IllegalArgumentException("숫자가 아닌 값이 포함되어 있습니다.");
            }
        }
    }

}
