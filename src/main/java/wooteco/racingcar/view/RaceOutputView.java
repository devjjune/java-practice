package wooteco.racingcar.view;

import java.util.List;

public class RaceOutputView {
    final static String RESULT_MESSAGE = "실행 결과";

    public static void printResultMessage() {
        System.out.println(RESULT_MESSAGE);
    }

    public static void printWinner(List<String> winnersName) {
        System.out.println();
        System.out.println("최종 우승자 : " + String.join(", ", winnersName));
    }
}
