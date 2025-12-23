package wooteco.racingcar.view;

import java.util.List;
import java.util.Map;

public class RaceOutputView {
    public void printStartMessage() {
        System.out.println("실행 결과");
    }

    public void printResult(Map<String, Integer> carPositions) {
        for (String eachCar : carPositions.keySet()) {
            int eachScore = carPositions.get(eachCar);
            System.out.println(eachCar + " : " + "-".repeat(eachScore));
        }

        System.out.println();
    }

    public void printWinner(List<String> winnersName) {
        System.out.println();
        System.out.println("최종 우승자 : " + String.join(", ", winnersName));
    }
}
