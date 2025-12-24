package wooteco.racingcar.controller;

import wooteco.racingcar.service.RaceService;
import wooteco.racingcar.validator.RaceValidator;
import wooteco.racingcar.view.RaceInputView;
import wooteco.racingcar.view.RaceOutputView;

import java.util.List;
import java.util.Map;

public class RaceController {
    public void run() {
        RaceService service = new RaceService();

        String inputNames = RaceInputView.readNames();
        int inputTries = RaceInputView.readTries();

        RaceOutputView.printResultMessage();
        Map<String, Integer> carPositions = service.startRace(inputNames);
        Map<String, Integer> carFinalPositions = service.playAllTurn(inputTries, carPositions);
        List<String> winnersName = service.findResult(carFinalPositions);

        RaceOutputView.printWinner(winnersName);
    }
}
