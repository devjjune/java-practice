package wooteco.racingcar.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class CarRace {
    public Map<String, Integer> carPositions = new HashMap<>();

    public Map<String, Integer> initializeScore(List<String> carNames) {
        for (String name : carNames) {
            carPositions.put(name, 0);
        }
        return carPositions;
    }

    public Map<String, Integer> movePosition(Map<String, Integer> carPositions) {
        for (String car : carPositions.keySet()) {
            int newPosition = carPositions.get(car) + pickRandomNumber();
            carPositions.replace(car, newPosition);
        }
        return carPositions;
    }

    public int pickRandomNumber() {
        Random random = new Random();
        int score = random.nextInt(10);

        if (score >= 4) {
            return score += 1;
        }

        return score;
    }
}
