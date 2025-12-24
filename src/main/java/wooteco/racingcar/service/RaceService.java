package wooteco.racingcar.service;

import wooteco.racingcar.model.CarRace;
import wooteco.racingcar.model.Cars;
import wooteco.racingcar.model.Result;

import java.util.*;

public class RaceService {
    public Map<String, Integer> startRace(String inputNames) {
        Cars cars = new Cars();
        CarRace race = new CarRace();

        List<String> carNames = cars.parseInputName(inputNames);
        return race.initializeScore(carNames);
    }

    public void playEachTurn(Map<String, Integer> carPositions) {
        CarRace carRace = new CarRace();

        Map<String, Integer> carNewPositions = carRace.movePosition(carPositions);
        for (String car : carNewPositions.keySet()) {
            System.out.println(car + " : " + "-".repeat(carNewPositions.get(car)));
        }
    }

    public Map<String, Integer> playAllTurn(int inputTries, Map<String, Integer> carPositions) {
        for (int i = 0; i < inputTries; i++) {
            playEachTurn(carPositions);
        }

        return carPositions;
    }

    public List<String> findResult(Map<String, Integer> carFinalPositions) {
        Result result = new Result();
        return result.calculateWinner(carFinalPositions);
    }
}
