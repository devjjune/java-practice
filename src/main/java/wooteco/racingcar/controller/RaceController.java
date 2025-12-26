package wooteco.racingcar.controller;

import wooteco.racingcar.model.Cars;
import wooteco.racingcar.model.RandomNumberGenerator;
import wooteco.racingcar.view.RaceInputView;

public class RaceController {
    public void run() {
        String inputNames = RaceInputView.readNames();
        int inputTries = RaceInputView.readTries();
        Cars cars = new Cars(inputNames);

        System.out.println("실행 결과");
        for (int i = 0; i < inputTries; i++) {
            RandomNumberGenerator generator = new RandomNumberGenerator();
            cars.moveCars(generator);
        }
    }
}
