package wooteco.racingcar.service;

import wooteco.racingcar.model.CarRace;
import wooteco.racingcar.model.Cars;

import java.util.*;

public class RaceService {
    public void startRace(String inputNames) {
        Cars cars = new Cars();
        CarRace race = new CarRace();

        List<String> carNames = cars.parseInputName(inputNames);
        race.initializeScore(carNames);
    }

    public void playEachTurn(Map<String, Integer> carPositions) {
        CarRace carRace = new CarRace();

        Map<String, Integer> carNewPositions = carRace.movePosition(carPositions);
        for (String car : carNewPositions.keySet()) {
            System.out.println(car + " : " + "-".repeat(carNewPositions.get(car)));
        }
    }
}
