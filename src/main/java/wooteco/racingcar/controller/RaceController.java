package wooteco.racingcar.controller;

import wooteco.racingcar.service.RaceService;
import wooteco.racingcar.validator.RaceValidator;
import wooteco.racingcar.view.RaceInputView;
import wooteco.racingcar.view.RaceOutputView;

import java.util.List;
import java.util.Map;

public class RaceController {
    public void run() {
        RaceValidator validator = new RaceValidator();
        RaceService service = new RaceService();

        String inputNames = RaceInputView.readNames();
        int inputTries = RaceInputView.readTries();

        Map<String, Integer> carPositions = service.startRace(inputNames);
        service.playAllTurn(inputTries, carPositions);
    }
}
