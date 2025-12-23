package wooteco.racingcar.controller;

public class RaceController {
    public static void run() {
        List<String> carNameList = InputHandler.readNames();
        Validator.validateName(carNameList);

        int numberOfTries = InputHandler.readTries();
        Validator.validateInt(numberOfTries);

        Map<String, Integer> carPositions = GameService.initializeCarPositions(carNameList);

        OutputView.printStartMessage();
        Map<String, Integer> result = GameService.playRounds(numberOfTries, carPositions);
        GameService.calculateWinner(carPositions);
    }
}
