package wooteco.racingcar.service;

import wooteco.racingcar.model.Result;

import java.util.*;

public class RaceService {
    public void playEachTurn(Map<String, Integer> carPositions) {
        CarRace carRace = new CarRace();

        Map<String, Integer> carNewPositions = carRace.movePosition(carPositions);
        for (String car : carNewPositions.keySet()) {
            System.out.println(car + " : " + "-".repeat(carNewPositions.get(car)));
        }
    }

    public Map<String, Integer> playAllTurn(int inputTries, Map<String, Integer> carPositions) {
        for (int i = 0; i < inputTries; i++) {
            System.out.println("[" + (i+1) + "회차 시도]");
            playEachTurn(carPositions);
            System.out.println();
        }

        return carPositions;
    }

    public List<String> findResult(Map<String, Integer> carFinalPositions) {
        Result result = new Result();
        return result.calculateWinner(carFinalPositions);
    }
}
