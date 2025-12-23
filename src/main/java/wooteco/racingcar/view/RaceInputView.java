package wooteco.racingcar.view;

import java.util.Scanner;

public class RaceInputView {
    final static String NAMES_MESSSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    final static String TRIES_MESSAGE = "시도할 횟수는 몇 회인가요?";

    public static String readNames() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(NAMES_MESSSAGE);
        return scanner.nextLine();
    }

    public static int readTries() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(TRIES_MESSAGE);

        return Integer.parseInt(scanner.nextLine());
    }
}
