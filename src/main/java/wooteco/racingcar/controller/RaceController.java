package wooteco.racingcar.controller;

import wooteco.racingcar.model.Cars;
import wooteco.racingcar.model.RandomNumberGenerator;
import wooteco.racingcar.view.RaceInputView;
import wooteco.racingcar.view.RaceOutputView;

import java.util.List;

public class RaceController {
    public void run() {
        String inputNames = RaceInputView.readNames();
        int inputTries = RaceInputView.readTries();
        Cars cars = new Cars(inputNames);

        RandomNumberGenerator generator = new RandomNumberGenerator();

        System.out.println("실행 결과");
        for (int i = 0; i < inputTries; i++) {
            cars.moveCars(generator);
            RaceOutputView.printEachTry(i + 1, cars.getCars());
        }

        List<String> winners = cars.calculateWinners();
        RaceOutputView.printWinner(winners);
    }
}
