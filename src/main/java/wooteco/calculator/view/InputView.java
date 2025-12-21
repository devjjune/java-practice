package wooteco.calculator.view;

import java.util.Scanner;

public class InputView {
    private static final String INPUT_MESSAGE = "덧셈할 문자열을 입력해 주세요.";

    public static String readInput() {
        System.out.println(INPUT_MESSAGE);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
