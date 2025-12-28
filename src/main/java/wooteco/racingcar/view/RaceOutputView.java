package wooteco.racingcar.view;

import wooteco.racingcar.model.Car;

import java.util.List;

public class RaceOutputView {
    public static void printEachTry(int i, List<Car> cars) {
        System.out.println("<" + i + "회차 시도>");
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + "-".repeat(car.getPosition()));
        }
    }

    public static void printWinner(List<String> winners) {
        String result = String.join(", ", winners);
        System.out.println("\n최종 우승자 : " + result);
    }
}
