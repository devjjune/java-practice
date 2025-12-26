package wooteco.racingcar.view;

import java.util.List;

public class RaceOutputView {
    public static void printWinner(List<String> winnersName) {
        System.out.println();
        System.out.println("최종 우승자 : " + String.join(", ", winnersName));
    }
}
