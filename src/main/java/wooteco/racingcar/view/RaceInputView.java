package wooteco.racingcar.view;

import java.util.Scanner;

public class RaceInputView {
    private static final String NAMES_MESSSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    private static final String TRIES_MESSAGE = "시도할 횟수는 몇 회인가요?";
    private static final Scanner scanner = new Scanner(System.in);

    public static String readNames() {
        System.out.println(NAMES_MESSSAGE);
        return scanner.nextLine();
    }

    public static int readTries() {
        System.out.println(TRIES_MESSAGE);
        String input = scanner.nextLine();
        return Integer.parseInt(input);
    }
}
