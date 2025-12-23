package wooteco.racingcar.service;

import wooteco.racingcar.view.RaceOutputView;

import java.util.*;

public class RaceService {
    public Map<String, Integer> initializeCarPositions(List<String> carList) {
        Map<String, Integer> scores = new HashMap<>();
        for (int i = 0; i < carList.size(); i++) {
            scores.put(carList.get(i), 0);
        }
        return scores;
    }

    public Map<String, Integer> playRounds(int numberOfTries, Map<String, Integer> carPositions) {
        for (int i = 0; i < numberOfTries; i++) {
            playOneTime(carPositions);
            RaceOutputView outputView = new RaceOutputView();
            outputView.printResult(carPositions);
        }
        return carPositions;
    }

    public Map<String, Integer> playOneTime(Map<String, Integer> carPositions) {
        for (String eachCar : carPositions.keySet()) {
            int eachPosition = carPositions.get(eachCar);
            eachPosition = attemptMove(eachPosition);
            carPositions.put(eachCar, eachPosition);
        }
        return carPositions;
    }

    public int attemptMove(int eachPosition) {
        int randomNumber = Randoms.pickNumberInRange(0, 9);
        if (randomNumber >= 4) {
            eachPosition += 1;
        }
        return eachPosition;
    }

    public void calculateWinner(Map<String, Integer> carPositions) {
        int maxScore = Collections.max(carPositions.values());
        List<String> winnersName = new ArrayList<>();

        for (Map.Entry<String, Integer> entry : carPositions.entrySet()) {
            RaceService service = new RaceService();
            service.addIfMaxScore(entry, maxScore, winnersName);
        }

        RaceOutputView outputView = new RaceOutputView();
        outputView.printWinner(winnersName);
    }

    public void addIfMaxScore(
            Map.Entry<String, Integer> entry, int maxScore, List<String> winners) {
        if (entry.getValue() == maxScore) {
            winners.add(entry.getKey());
        }
    }
}
