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

        RaceInputView inputView = new RaceInputView();
        List<String> carNameList = inputView.readNames();
        validator.validateName(carNameList);

        int numberOfTries = inputView.readTries();
        validator.validateInt(numberOfTries);

        Map<String, Integer> carPositions = service.initializeCarPositions(carNameList);

        RaceOutputView outputView = new RaceOutputView();
        outputView.printStartMessage();
        Map<String, Integer> result = service.playRounds(numberOfTries, carPositions);
        service.calculateWinner(carPositions);
    }
}
